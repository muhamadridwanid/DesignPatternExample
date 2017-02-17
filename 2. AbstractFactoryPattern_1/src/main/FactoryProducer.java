/*
 * Copyright Muhamadridwan.id
 */
package main;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        
        return null;
    }
    
}
