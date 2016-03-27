package com.ht.builder.demo1;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Client {
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
