/*
 * Copyright Muhamadridwan.id
 */
package main;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
public class HewanFactory {
    public Hewan getHewan(String tipe){
        if (tipe.equalsIgnoreCase("ayam")) {
            return new Ayam();
        }else if (tipe.equalsIgnoreCase("kambing")) {
            return new Kambing();
        }else if (tipe.equalsIgnoreCase("kucing")) {
            return new Kucing();
        }else if (tipe.equalsIgnoreCase("sapi")) {
            return new Sapi();
        }else{
            return null;
        }
    }
    
}
