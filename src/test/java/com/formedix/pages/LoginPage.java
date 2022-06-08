package com.formedix.pages;

import com.formedix.utilities.ConfigurationReader;
import com.formedix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy (id = "username")
    public WebElement userNameInputBox;

    @FindBy (id = "password")
    public WebElement passWordInputBox;

    @FindBy (id = "btnSubmit")
    public WebElement signInButton;




public void login(){

    String url = ConfigurationReader.get("url");
    String userName = ConfigurationReader.get("userName");
    String passWord = ConfigurationReader.get("passWord");

    Driver.get().get(url);
    userNameInputBox.sendKeys(userName);
    passWordInputBox.sendKeys(passWord);




}

}
