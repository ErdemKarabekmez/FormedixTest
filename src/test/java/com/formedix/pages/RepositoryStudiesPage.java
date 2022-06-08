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

    @FindBy (id = "fdxMdbContainerListItem0View")
    public WebElement View;

    @FindBy (id = "dataAcquisitionName")
    public WebElement dataAcquisition;

    @FindBy (id = "FORMTypeName")
    public WebElement Forms;


    public void mouseAction() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(repositoryMenu).perform();
        actions.moveToElement(studiesMenu).perform();
        studiesMenu.click();
    }

    public List<String> getTechStudyOptions() {
        techStudyMenu.click();
        List<WebElement> list = Driver.get().findElements(By.xpath("//li[starts-with(@id,'fdxMdbContainerListItem')]"));
        List<String> options = new ArrayList<>();

        for (WebElement el : list) {
            options.add(el.getText());
        }
        return options;

    }
}
