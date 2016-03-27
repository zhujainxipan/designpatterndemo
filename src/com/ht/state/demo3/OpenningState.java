package com.ht.state.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        // 改状态下的重点方法
        System.out.println("门打开");
    }

    @Override
    public void close() {
        // 开门状态下可以关上门
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();

    }

    @Override
    public void run() {
        // 开门状态下不可以运行
    }

    @Override
    public void stop() {
        // 开门状态下可以停止
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();

    }
}
