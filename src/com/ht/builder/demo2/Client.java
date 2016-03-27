package com.ht.builder.demo2;

import com.ht.builder.demo1.BenzModel;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Client {
    public static void main(String[] args) {
//        ArrayList<String> sequence = new ArrayList<>();
//        sequence.add("start");
//        sequence.add("stop");
//        sequence.add("alarm");
//
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//
//        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
//        benzModel.run();

        Director director = new Director();
        director.getBenzModel().run();

        director.getBMModel().run();

    }
}
