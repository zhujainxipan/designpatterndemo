package com.ht.state.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class StopingState extends LiftState {
    @Override
    public void open() {
        // 可以
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();

    }

    @Override
    public void close() {
        // 可以
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();

    }

    @Override
    public void run() {
        // 可以
        super.context.setLiftState(Context.runingState);
        super.context.getLiftState().run();


    }

    @Override
    public void stop() {
        // 该状态的核心方法
        System.out.println("电梯停止了");
    }
}
