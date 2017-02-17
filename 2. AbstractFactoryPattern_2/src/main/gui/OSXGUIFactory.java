/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main.gui;

import main.api.Button;
import main.api.Form;
import main.api.GUIFactory;
import main.button.OSXButton;
import main.form.OSXForm;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class OSXGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new OSXButton();
    }

    @Override
    public Form createForm() {
        return new OSXForm();
    }
    
}
