package com.ht.mediator.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by annuoaichengzhang on 16/4/4.
 */
public abstract class Mediator {
    protected List<Person> landlordList = new ArrayList<>();
    protected List<Person> renterList = new ArrayList<>();

    public void registerLandlord(Person landLord) {
        landlordList.add(landLord);
    }

    public void registerRenter(Person renter){
        renterList.add(renter);
    }

    public abstract void operation(Person person, String message);
}
