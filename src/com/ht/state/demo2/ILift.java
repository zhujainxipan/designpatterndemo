package com.ht.state.demo2;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public interface ILift {
    public final static int OPENING_STATE = 1;
    public final static int CLOSING_STATE = 2;
    public final static int RUNING_STATE = 3;
    public final static int STOPPING_STATE = 4;

    public void setState(int state);

    public void open();
    public void close();
    public void run();
    public void stop();
}
