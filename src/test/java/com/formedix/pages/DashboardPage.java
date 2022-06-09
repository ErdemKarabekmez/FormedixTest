package com.formedix.pages;

import com.formedix.utilities.BrowserUtils;
import com.formedix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.stream.Collectors;

public class DashboardPage extends BasePage {

    @FindBy(css = ".fdx-main-nav-item-label")
    public List<WebElement> menuItems;

    @FindBy(css = ".fdx-sub-nav-menu-item-label")
    public List<WebElement> subMenuItems;

    @FindBy(id = "fdxMdbContainerListItem0MenuToggle")
    public WebElement techStudyMenu;

    @FindBy (id = "fdxMdbContainerListItem0View")
    public WebElement View;

    @FindBy(css = "#fdxMdbContainerListItem0Menu>li")
    public List<WebElement> viewList;

    @FindBy (id = "dataAcquisitionName")
    public WebElement dataAcquisition;

    @FindBy (id = "FORMTypeName")
    public WebElement Forms;


    public List<String> getTechStudyOptions()  {

        techStudyMenu.click();
        BrowserUtils.waitForClickablility(View,5);
        List<String> options = viewList.stream().map(p->p.getText()).collect(Collectors.toList());

        return options;
    }

    public void navigateTo(String menuOption, String subMenuOption) {
        Actions actions = new Actions(Driver.get());

        menuItems.stream().forEach(item->{if(item.getText().equals(menuOption)){actions.moveToElement(item).perform();}});
        subMenuItems.stream().forEach(subItem->{if(subItem.getText().equals(subMenuOption)){subItem.click();}});
    }


}