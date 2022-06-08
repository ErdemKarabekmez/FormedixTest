package com.formedix.pages;

import com.formedix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends BasePage {

    @FindBy(css = ".fdx-main-nav-item-label")
    public List<WebElement> menuItems;

    @FindBy(css = ".fdx-sub-nav-menu-item-label")
    public List<WebElement> subMenuItems;

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

    public List<String> getTechStudyOptions() throws InterruptedException {

        techStudyMenu.click();
        Thread.sleep(2000);
        List<WebElement> list = Driver.get().findElements(By.xpath("//li[starts-with(@id,'fdxMdbContainerListItem')]"));
        List<String> options = new ArrayList<>();

        for (WebElement el : list) {
            options.add(el.getText());
        }

        return options;

    }

    public void navigateTo(String menuOption, String subMenuOption) {
        Actions actions = new Actions(Driver.get());

        menuItems.stream().forEach(p->{if(p.getText().equals(menuOption)){actions.moveToElement(p);}});
        subMenuItems.stream().forEach(p->{if(p.getText().equals(subMenuOption)){p.click();}});
    }


}
