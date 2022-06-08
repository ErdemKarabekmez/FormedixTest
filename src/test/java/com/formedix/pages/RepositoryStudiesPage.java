package com.formedix.pages;

import com.formedix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class RepositoryStudiesPage extends BasePage {

    @FindBy(id = "menuMdb")
    public WebElement repositoryMenu;

    @FindBy(id = "menuMdbStudies")
    public WebElement studiesMenu;

    @FindBy(id = "fdxMdbContainerListItem0MenuToggle")
    public WebElement techStudyMenu;


    public void mouseAction() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(repositoryMenu).perform();
        actions.moveToElement(studiesMenu).perform();
        studiesMenu.click();
    }

    public void getTechStudyOptions() {
        techStudyMenu.click();
        List<WebElement> list = Driver.get().findElements(By.xpath("//li[starts-with(@id,'fdxMdbContainerListItem')]"));


    }
}
