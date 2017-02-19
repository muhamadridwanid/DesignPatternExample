/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package itemImpl;

import api.Item;
import api.Packing;
import packingImpl.Wrapper;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
