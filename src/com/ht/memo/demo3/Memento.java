package com.ht.memo.demo3;

import java.util.HashMap;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Memento {
    private HashMap<String, Object> stateMap;

    public Memento(HashMap<String, Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
