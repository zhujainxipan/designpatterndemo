package com.ht.Responsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by annuoaichengzhang on 16/3/23.
 * 三从四德的例子:在家从父,出嫁从夫,夫死从子
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : list) {
            father.HandleMessage(women);
        }
    }
}
