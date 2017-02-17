/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main.gui;

import main.api.Button;
import main.api.Form;
import main.api.GUIFactory;
import main.button.WinButton;
import main.form.WinForm;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class WinGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Form createForm() {
        return new WinForm();
    }
    
}
