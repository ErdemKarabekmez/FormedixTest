package com.formedix.pages;

import com.formedix.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    /**
     * Constructor to initialize Driver
     */
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
