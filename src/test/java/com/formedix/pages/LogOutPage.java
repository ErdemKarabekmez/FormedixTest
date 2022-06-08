package com.formedix.pages;

import com.formedix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage {

    @FindBy (id = "menuUser")
    public WebElement userIcon;

    @FindBy (id = "menuUserLogout")
    public WebElement signOutButton;


    public void logout(){

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(userIcon).perform();
        actions.moveToElement(signOutButton).perform();
        signOutButton.click();


    }
}
