package com.ht.Responsibility;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public abstract class Handler {
    // 父亲
    public final static int FATHER_LEVEL_REQUEST = 1;
    // 丈夫
    public final static int HUSRAND_LEVEL_REQUEST = 2;
    // 儿子
    public final static int SON_LEVEL_REQUEST = 3;
    // 能处理的等级
    private int level = 0;

    // 下一个责任人
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    /**
     *
     * @param handler
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 对请示的回应
     * @param women
     */
    protected abstract void response(IWomen women);

    /**
     * 处理请求
     * @param women
     */
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("------没地方请示了,按不同意处理-----");
            }
        }
    }
}
