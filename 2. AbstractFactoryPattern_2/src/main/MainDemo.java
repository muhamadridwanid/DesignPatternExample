package main;

import main.api.Button;
import main.api.Form;
import main.api.GUIFactory;
import main.gui.LinuxGUIFactory;
import main.gui.OSXGUIFactory;
import main.gui.WinGUIFactory;

/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class MainDemo {

    /**
     * This is just for the sake of testing this program, and doesn't have to do
     * with Abstract Factory pattern.
     *
     * @return
     */
    public static String randomAppearance() {
        String[] appearanceArr = new String[4];
        appearanceArr[0] = "osx";
        appearanceArr[1] = "windows";
        appearanceArr[2] = "linux";
        appearanceArr[3] = "error";
        java.util.Random rand = new java.util.Random();
        int randNum = rand.nextInt(3);
        return appearanceArr[randNum];
    }

    public static void main(String[] args) throws Exception {
        GUIFactory factory = null;

        String appearance = randomAppearance();
        switch (appearance) {
            case "osx":
                factory = new OSXGUIFactory();
                break;
            case "windows":
                factory = new WinGUIFactory();
                break;
            case "linux":
                factory = new LinuxGUIFactory();
                break;
            default:
                throw new Exception("No such operating system");
        }
        
        Button button = factory.createButton();
        button.paint();

        Form form = factory.createForm();
        form.paint();

    }

}
