package com.formedix.stepDefinitions;

import com.formedix.pages.LoginPage;
import com.formedix.utilities.ConfigurationReader;
import com.formedix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the sign in page")
    public void userIsOnTheSignInPage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("User type valid username and password and click the sign in button")
    public void userTypeValidUsernameAndPasswordAndClickTheSignInButton() {
        loginPage.login();
    }
}
