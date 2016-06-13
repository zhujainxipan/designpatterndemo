package com.ht.visitor.demo3;

/**
 * Created by annuoaichengzhang on 16/6/13.
 */
public class ShoppingCartClient {
    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[] {new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calcutePrice(itemElements);
        System.out.println("Total Cost = "+total);
    }

    private static int calcutePrice(ItemElement[] itemElements) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement itemElement : itemElements) {
            sum = sum + itemElement.accept(visitor);
        }
        return sum;
    }
}
