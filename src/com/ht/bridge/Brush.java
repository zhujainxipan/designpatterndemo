package com.ht.bridge;

import java.awt.*;

/**
 * Created by annuoaichengzhang on 16/6/12.
 * 画笔类
 */
public abstract class Brush {
    // 颜色类
    protected BrushColor color;

    // 画画功能
    public abstract void paint();

    // 设定画笔颜色类对象
    public void setColor(BrushColor color) {
        this.color = color;
    }
}
