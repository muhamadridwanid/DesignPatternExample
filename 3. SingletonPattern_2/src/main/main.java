package main;

/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Buat 2 Object ClassBiasa Kemudian bandingkan dengan equals.
        ClassBiasa biasa1 = new ClassBiasa();
        ClassBiasa biasa2 = new ClassBiasa();

        System.out.println("ClassBiasa Biasa");
        System.out.println("--------------------");
        System.out.println("Object 1 : " + biasa1);
        System.out.println("Object 2 : " + biasa2);

        if (biasa1.equals(biasa2)) {
            System.out.println("Object sama");
        } else {
            System.out.println("Object Beda");
        }

        //Buat 2 Object ClassBiasa Kemudian bandingkan dengan equals.
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        ClassSingleton singleton2 = ClassSingleton.getInstance();

        System.out.println();
        System.out.println("ClassSingleton");
        System.out.println("--------------------");
        System.out.println("Object 1 : " + singleton1);
        System.out.println("Object 2 : " + singleton2);
        
        if (singleton1.equals(singleton2)) {
            System.out.println("Object sama");
        } else {
            System.out.println("Object Beda");
        }
    }

}
