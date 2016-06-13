package com.ht.visitor.demo3;

/**
 * Created by annuoaichengzhang on 16/6/13.
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50) {
            // 折扣优惠
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }
}
