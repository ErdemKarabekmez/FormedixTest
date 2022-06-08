package com.formedix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class FormPage extends BasePage {

    @FindBy (xpath = "(//div[@class='fdx-ellipsis'])[4]")
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


