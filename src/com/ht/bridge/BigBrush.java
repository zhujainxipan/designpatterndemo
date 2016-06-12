package com.ht.bridge;

/**
 * Created by annuoaichengzhang on 16/6/12.
 */
public class BigBrush extends Brush {
    @Override
    public void paint() {
        System.out.println("大号画笔颜色:" + this.color.color);
    }
}
