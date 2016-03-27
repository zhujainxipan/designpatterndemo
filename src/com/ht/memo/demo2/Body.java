package com.ht.memo.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Body {
    private String state = "";
    public void changeState() {
        this.state = "心情可能很不好";
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
