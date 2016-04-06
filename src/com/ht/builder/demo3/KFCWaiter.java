package com.ht.builder.demo3;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class KFCWaiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildFood();;
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}
