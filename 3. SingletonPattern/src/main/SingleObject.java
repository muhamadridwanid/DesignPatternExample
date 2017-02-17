/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello World");
    }
    
}
