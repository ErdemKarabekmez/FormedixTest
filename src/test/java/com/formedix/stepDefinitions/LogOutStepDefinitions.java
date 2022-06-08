package com.formedix.stepDefinitions;

import com.formedix.pages.LogOutPage;
import com.formedix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDefinitions {

    LogOutPage logOutPage = new LogOutPage();

    @Given("User is hover over on the user icon and click on the sign out")
    public void userIsHoverOverOnTheUserIconAndClickOnTheSignOut() {
        logOutPage.logout();
    }


    @Then("User is on the sign in page")
    public void userIsOnTheSignInPage() {
        Driver.get().getTitle();

    }
}
