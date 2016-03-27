package com.ht.command.demo2;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Receiver {
    public int currentChannel = 0;

    public void turnOn() {
        System.out.println("打开电视机");
    }

    public void turnOff() {
        System.out.println("关闭电视机");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("改变电视机频道");
    }
}
