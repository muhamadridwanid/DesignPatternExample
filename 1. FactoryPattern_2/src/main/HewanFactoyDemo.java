/*
 * Copyright Muhamadridwan.id
 */
package main;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
public class HewanFactoyDemo {
    public static void main(String[] args) {
        HewanFactory hewanFactory = new HewanFactory();
        Hewan hewan1 = hewanFactory.getHewan("ayam");
        hewan1.bersuara();
        
        Hewan hewan2 = hewanFactory.getHewan("kambing");
        hewan2.bersuara();
        
        Hewan hewan3 = hewanFactory.getHewan("kucing");
        hewan3.bersuara();
        
        Hewan hewan4 = hewanFactory.getHewan("sapi");
        hewan4.bersuara();
        
        
    }
}
