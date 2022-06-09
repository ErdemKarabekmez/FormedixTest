package com.formedix.stepDefinitions;


import com.formedix.pages.DashboardPage;
import com.formedix.utilities.BrowserUtils;
import io.cucumber.java.en.When;


public class DashboardPageStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @When("User navigate to {string} {string} menu")
    public void userNavigateToMenu(String menuOption, String subMenuOption)  {

        BrowserUtils.waitForPageToLoad(15);
        dashboardPage.navigateTo(menuOption,subMenuOption);
    }


}
