package com.formedix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;

public class FormPage extends BasePage {

    @FindBy (id = "uuid-edfdfc00-9dff-431f-bf75-269ba934b9ec")
    public WebElement medicalHistoryForm;

    @FindBy (id = "switchEditMode")
    public WebElement editFormButton;

    @FindBy (id = "assetLocaleEditTextTextareadescription")
    public WebElement descriptionBox;

    @FindBy (id = "saveAsset")
    public WebElement validateUpdateButton;

    @FindBy (xpath = "//div[@class='locale']/span[2]")
    public WebElement propertyPanel;

    @FindBy (id = "formDescription")
    public WebElement mainFormView;


}
