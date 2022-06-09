package com.formedix.stepDefinitions;


import com.formedix.pages.DashboardPage;
import com.formedix.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;

public class DashboardPageStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("User navigate to {string} {string} menu")
    public void userNavigateToMenu(String menuOption, String subMenuOption) {

        BrowserUtils.waitForPageToLoad(15);
        dashboardPage.navigateTo(menuOption,subMenuOption);
    }


    @When("User should see following options")
    public void user_should_see_following_options(List<String> techStudyOptions) {

        Assert.assertEquals(techStudyOptions, dashboardPage.getTechStudyOptions());


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
