package com.ht.state.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        // 关闭状态下可以打开们
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();

    }

    @Override
    public void close() {
        System.out.println("门关闭");

    }

    @Override
    public void run() {
        // 关闭状态下可以运行
        super.context.setLiftState(Context.runingState);
        super.context.getLiftState().run();

    }

    @Override
    public void stop() {
        // 关闭状态下可以停止
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();


    }
}
