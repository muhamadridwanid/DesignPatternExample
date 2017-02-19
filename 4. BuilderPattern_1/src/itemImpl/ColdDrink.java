/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package itemImpl;

import api.Item;
import api.Packing;
import packingImpl.Bottle;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
    
}
