/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package itemImpl.ColdImpl;

import itemImpl.ColdDrink;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
    
}
