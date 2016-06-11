package com.ht.singleton;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by annuoaichengzhang on 16/6/11.
 */
public class Emperor {
    private static int MAXNUMOFEMPEROR = 2;
    private static ArrayList<Emperor> emperors = new ArrayList<>();

    static {
        for (int i = 0; i < MAXNUMOFEMPEROR; i++) {
            emperors.add(new Emperor("皇帝" + i));
        }
    }

    private Emperor(String name) {

    }

    public static Emperor getInstance() {
        Random random = new Random();
        int nextInt = random.nextInt(MAXNUMOFEMPEROR);
        return emperors.get(nextInt);
    }

}
