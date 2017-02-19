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
public class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
    
}
