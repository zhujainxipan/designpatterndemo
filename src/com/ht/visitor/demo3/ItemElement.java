package com.ht.visitor.demo3;

/**
 * Created by annuoaichengzhang on 16/6/13.
 */
public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
