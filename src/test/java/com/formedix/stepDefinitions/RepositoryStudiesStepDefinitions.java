package com.formedix.stepDefinitions;


import com.formedix.pages.RepositoryStudiesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class RepositoryStudiesStepDefinitions {

RepositoryStudiesPage repositoryStudiesPage = new RepositoryStudiesPage();

    @Given("User navigate to Repository-Studies menu")
    public void user_navigate_to_Repository_Studies_menu() {

       repositoryStudiesPage.mouseAction();

    }

    @When("User should see following options")
    public void user_should_see_following_options(List<String> techStudyOptions) {



    }

    @When("User click on the View")
    public void user_click_on_the_View() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click on the Data acquisition")
    public void user_click_on_the_Data_acquisition() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User click on the Forms")
    public void user_click_on_the_Forms() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
