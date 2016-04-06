package com.ht.builder.demo3;

/**
 * Created by annuoaichengzhang on 16/4/6.
 * 套餐A
 */
public class MealABuilder extends MealBuilder {
    @Override
    public void buildFood() {
        super.meal.setFood("一盒薯条");
    }

    @Override
    public void buildDrink() {
        super.meal.setDrink("一杯可乐");
    }
}
