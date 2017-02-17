/*
 * Copyright Muhamadridwan.id
 */
package main;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
public class ShapeFactory extends AbstractFactory{

    
    @Override
    Color getColor(String color) {
        return null;
    }

    Shape getShape(String shape) {
        if (shape==null) {
            return null;
        }
        
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        }else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        
        return null;
    }
    
}
