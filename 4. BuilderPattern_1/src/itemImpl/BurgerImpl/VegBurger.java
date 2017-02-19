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
public class VegBurger extends Burger{

    
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
    
}
