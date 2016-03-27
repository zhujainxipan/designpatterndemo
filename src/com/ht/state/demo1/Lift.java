package com.ht.state.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Lift implements ILift {
    @Override
    public void open() {
        System.out.println("电梯门打开");

    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
    }
}
