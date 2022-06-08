package com.formedix.stepDefinitions;


import com.formedix.pages.RepositoryStudiesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class RepositoryStudiesStepDefinitions {

RepositoryStudiesPage repositoryStudiesPage = new RepositoryStudiesPage();

    @Given("User navigate to Repository-Studies menu")
    public void user_navigate_to_Repository_Studies_menu() {

       repositoryStudiesPage.mouseAction();

    }

    @When("User should see following options")
    public void user_should_see_following_options(List<String> techStudyOptions) {

        Assert.assertEquals(techStudyOptions,repositoryStudiesPage.getTechStudyOptions());

    }

    @When("User click on the View")
    public void user_click_on_the_View() {

        repositoryStudiesPage.View.click();

    }

    @When("User click on the Data acquisition")
    public void user_click_on_the_Data_acquisition() {
        repositoryStudiesPage.dataAcquisition.click();
    }

    @When("User click on the Forms")
    public void user_click_on_the_Forms() {

        repositoryStudiesPage.Forms.click();
    }




}
