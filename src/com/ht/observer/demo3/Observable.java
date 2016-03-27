package com.ht.observer.demo3;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);
}
