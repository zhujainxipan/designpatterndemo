package com.ht.mediator.demo2;

/**
 * Created by annuoaichengzhang on 16/4/4.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new HouseMediator();
        Person landlordA, landlordB, renter;
        landlordA = new LandLord(mediator, "房东a");
        landlordB = new LandLord(mediator, "房东b");

        renter = new Renter(mediator, "小吕");
        mediator.registerLandlord(landlordA);
        mediator.registerLandlord(landlordB);
        mediator.registerRenter(renter);

        renter.sendMessage("想在四惠东附近租套一居室,加个1500");
        landlordA.sendMessage("在四惠东附近有一套两居室要出租,租金3000,联系电话0101010101001");
    }
}
