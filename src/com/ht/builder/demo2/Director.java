package com.ht.builder.demo2;

import com.ht.builder.demo1.BMModel;
import com.ht.builder.demo1.BenzModel;
import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMBuilder bmBuilder = new BMBuilder();

    public BenzModel getBenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.sequence.add("alarm");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMModel getBMModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.sequence.add("alarm");
        this.bmBuilder.setSequence(this.sequence);
        return (BMModel) this.bmBuilder.getCarModel();
    }

}
