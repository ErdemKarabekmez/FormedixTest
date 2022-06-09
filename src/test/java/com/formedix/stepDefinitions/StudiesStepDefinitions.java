package com.formedix.stepDefinitions;

import com.formedix.pages.StudiesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import java.util.List;

public class StudiesStepDefinitions {

    StudiesPage studiesPage = new StudiesPage();

    @Then("User should see following options")
    public void user_should_see_following_options(List<String> techStudyOptions) {

        Assert.assertEquals(techStudyOptions, studiesPage.getTechStudyOptions());
    }

    @And("User click on the View")
    public void user_click_on_the_View() {

        studiesPage.View.click();
    }

    @And("User click on the Data acquisition")
    public void user_click_on_the_Data_acquisition() {

        studiesPage.dataAcquisition.click();
    }

    @And("User click on the Forms")
    public void user_click_on_the_Forms() {

        studiesPage.Forms.click();
    }


}
