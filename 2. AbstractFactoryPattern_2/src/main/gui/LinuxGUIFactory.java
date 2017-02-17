/*
 * Copyright (c) 2017 Muhamad Ridwan. All rights reserved.
 *
 */
package main.gui;

import main.api.Button;
import main.api.Form;
import main.api.GUIFactory;
import main.button.LinuxButton;
import main.form.LinuxForm;

/**
 *
 * @author Muhamad Ridwan - http://muhamadridwan.id
 */
public class LinuxGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Form createForm() {
        return new LinuxForm();
    }
    
}
