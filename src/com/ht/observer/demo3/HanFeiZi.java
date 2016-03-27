package com.ht.observer.demo3;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class HanFeiZi implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observers) {
            observer.update(context);
        }
    }

    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了");
        // 通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }
}
