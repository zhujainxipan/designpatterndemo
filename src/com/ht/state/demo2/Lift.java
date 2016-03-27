package com.ht.state.demo2;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Lift implements ILift {
    private int state;


    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //DO NOTHING
                break;
            case RUNING_STATE:
                //DO NOTHING
                break;
            case STOPPING_STATE:
                //DO NOTHING
                break;
        }

    }

    private void closeWithLogic() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
