package com.ht.builder.demo3;

/**
 * Created by annuoaichengzhang on 16/4/6.
 * 套餐构造器
 */
public abstract class MealBuilder {
    Meal meal = new Meal();
    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
