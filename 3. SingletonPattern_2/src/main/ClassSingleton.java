/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class ClassSingleton {
    
    private static ClassSingleton instance;

    public static ClassSingleton getInstance() {
        if (instance==null) {
            instance = new ClassSingleton();
        }
        
        return instance;
    }
    
    private ClassSingleton() {
    }
    
}
