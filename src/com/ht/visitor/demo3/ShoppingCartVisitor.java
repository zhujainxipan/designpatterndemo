package com.ht.visitor.demo3;


/**
 * Created by annuoaichengzhang on 16/6/13.
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
