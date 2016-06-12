package com.ht.bridge;

/**
 * Created by annuoaichengzhang on 16/6/12.
 */
public class Client {
    public static void main(String[] args) {
        Brush brush = new BigBrush();
        brush.setColor(new RedColor());
        brush.paint();

        brush = new SmallBrush();
        brush.setColor(new BlueColor());
        brush.paint();
    }
}
