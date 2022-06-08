package com.formedix.stepDefinitions;

import com.formedix.pages.LoginPage;
import com.formedix.utilities.ConfigurationReader;
import com.formedix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the sign in page and enters valid username and password")
    public void userIsOnTheSignInPageAndEntersValidUsernameAndPassword() {

        loginPage.login();

    }

    @When("User click on the sign in button")
    public void user_click_on_the_sign_in_button() {

        loginPage.signInButton.click();
    }

    @Then("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {

        String title = Driver.get().getTitle();
        System.out.println(title);

    }


}
