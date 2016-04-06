package com.ht.builder.demo3;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class MealBBuilder extends MealBuilder {
    @Override
    public void buildFood() {
        super.meal.setFood("三个鸡翅");
    }

    @Override
    public void buildDrink() {
        super.meal.setDrink("一杯柠檬汁");
    }
}
