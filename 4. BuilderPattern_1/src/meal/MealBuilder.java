/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package meal;

import itemImpl.BurgerImpl.ChickenBurger;
import itemImpl.BurgerImpl.VegBurger;
import itemImpl.ColdImpl.Coke;
import itemImpl.ColdImpl.Pepsi;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
