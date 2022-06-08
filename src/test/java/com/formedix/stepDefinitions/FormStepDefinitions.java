package com.formedix.stepDefinitions;

import com.formedix.pages.FormPage;
import com.formedix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class FormStepDefinitions {

    FormPage formPage = new FormPage();
    String description = "test";


    @Given("User select the medical history form")
    public void user_select_the_medical_history_form() {

        formPage.medicalHistoryForm.click();

    }

    @When("User click on the Edit Form")
    public void user_click_on_the_Edit_Form() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", formPage.editFormButton);



    }

    @When("User add a description and save the change")
    public void user_add_a_description_and_save_the_change() {


        formPage.descriptionBox.clear();
        formPage.descriptionBox.sendKeys(description);
        formPage.validateUpdateButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", formPage.editFormButton);

    }

    @Then("verify updates has been preserved on the property panel and on the main form view")
    public void verify_updates_has_been_preserved_on_the_property_panel_and_on_the_main_form_view() {

        Assert.assertEquals(description, formPage.propertyPanel.getText());
        Assert.assertEquals(description, formPage.mainFormView.getText());


    }

    @And("User logout of the application")
    public void userLogoutOfTheApplication() {

    }
}
