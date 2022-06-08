package com.formedix.stepDefinitions;


import com.formedix.pages.DashboardPage;
import com.formedix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DashboardPageStepDefinitions {

DashboardPage dashboardPage = new DashboardPage();

    @Given("User navigate to {string} {string} menu")
    public void userNavigateToMenu(String menuOption, String subMenuOption) {
        dashboardPage.navigateTo(menuOption,subMenuOption);
    }

    @Then("Verify the dashboard page")
    public void verifyTheDashboardPage() {
      Assert.assertTrue(Driver.get().getTitle().equals("Home - ryze"));
    }

    @When("User should see following options")
    public void user_should_see_following_options(List<String> techStudyOptions) throws InterruptedException {

        Assert.assertEquals(techStudyOptions,dashboardPage.getTechStudyOptions());


    }

    @When("User click on the View")
    public void user_click_on_the_View() {

        dashboardPage.View.click();

    }

    @When("User click on the Data acquisition")
    public void user_click_on_the_Data_acquisition() {
        dashboardPage.dataAcquisition.click();
    }

    @When("User click on the Forms")
    public void user_click_on_the_Forms() {

        dashboardPage.Forms.click();
    }



}
