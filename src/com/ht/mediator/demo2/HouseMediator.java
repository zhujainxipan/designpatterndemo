package com.ht.mediator.demo2;

/**
 * Created by annuoaichengzhang on 16/4/4.
 */
public class HouseMediator extends Mediator {
    @Override
    public void operation(Person person, String message) {
        // 如果是租房者,就把租房者的需求信息传递给注册了的房东们
        if (person instanceof Renter) {
            for (Person landlord : landlordList) {
                landlord.getMessage(message);
            }
        } else if (person instanceof LandLord) {
            // 如果是房东,就把房东的出租消息传递给注册了的求租者
            for (Person renter : renterList) {
                renter.getMessage(message);
            }
        }
    }
}
