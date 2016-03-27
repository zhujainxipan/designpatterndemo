package com.ht.state.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class RuningState extends LiftState {
    @Override
    public void open() {
        // 不可以

    }

    @Override
    public void close() {
        //

    }

    @Override
    public void run() {
        // 该状态的核心方法
        System.out.println("电梯在运行");

    }

    @Override
    public void stop() {
        // 可以停止
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState().stop();

    }
}
