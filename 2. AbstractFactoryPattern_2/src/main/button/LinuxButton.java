/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main.button;

import main.api.Button;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class LinuxButton implements Button{

    @Override
    public void paint() {
        System.out.println("Linux Button");
    }
    
}
