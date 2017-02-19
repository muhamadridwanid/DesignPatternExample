/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main;

import meal.Meal;
import meal.MealBuilder;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class Demo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();

        System.out.println("Total Cost: " + vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();

        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
