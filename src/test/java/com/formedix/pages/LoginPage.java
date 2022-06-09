package com.formedix.pages;

import com.formedix.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    /**
     * Locators
     */

    @FindBy(id = "username")
    public WebElement userNameInputBox;

    @FindBy(id = "password")
    public WebElement passWordInputBox;

    @FindBy(id = "btnSubmit")
    public WebElement signInBtn;


    /**
     * Methods
     */

    /**
     * This method is login to the  application
     */

    public void login() {

        String userName = ConfigurationReader.get("userName");
        String passWord = ConfigurationReader.get("passWord");

        userNameInputBox.sendKeys(userName);
        passWordInputBox.sendKeys(passWord);
        signInBtn.click();
    }

}
