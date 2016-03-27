package com.ht.state.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.closingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
