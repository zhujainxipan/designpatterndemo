package com.ht.bridge;

/**
 * Created by annuoaichengzhang on 16/6/12.
 */
public class MidBrush extends Brush {
    @Override
    public void paint() {
        System.out.println("中号画笔颜色:" + this.color.color);
    }
}
