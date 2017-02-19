/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package itemImpl.BurgerImpl;

import itemImpl.Burger;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
    
}
