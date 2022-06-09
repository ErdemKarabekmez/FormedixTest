package com.formedix.pages;

import com.formedix.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FormPage extends BasePage {

    /**
     * Locators
     */

    @FindBy(xpath = "(//div[@class='fdx-ellipsis'])[4]")
    public WebElement medicalHistoryForm;

    @FindBy(id = "switchEditMode")
    public WebElement editFormButton;

    @FindBy(id = "assetLocaleEditTextTextareadescription")
    public WebElement descriptionBox;

    @FindBy(id = "saveAsset")
    public WebElement validateUpdateButton;

    @FindBy(xpath = "//div[@class='locale']/span[2]")
    public WebElement propertyPanel;

    @FindBy(id = "formDescription")
    public WebElement mainFormView;


    /**
     * Methods
     */

    /**
     * This method is clicking 'Edit form' button'
     */
    public void click() {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", editFormButton);
    }

    /**
     * This method is adding description to form and saving
     */
    public void addDescriptionAndSave(String description) {

        descriptionBox.clear();
        descriptionBox.sendKeys(description);
        validateUpdateButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", editFormButton);
    }
}



