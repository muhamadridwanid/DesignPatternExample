/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ERROR karena constructor mempunyai access medifier private
        //SingleObject singleObject = new SingleObject();
        
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
        
    }
    
}
