package com.formedix.pages;


import com.formedix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class DashboardPage extends BasePage {

    /**
     * Locators
     */

    @FindBy(css = ".fdx-main-nav-item-label")
    public List<WebElement> menuItems;

    @FindBy(css = ".fdx-sub-nav-menu-item-label")
    public List<WebElement> subMenuItems;



    /**
     * Methods
     */

    /**
     * This method is navigating to menu and submenu on the left side of the page
     */

    public void navigateTo(String menuOption, String subMenuOption) {

        Actions actions = new Actions(Driver.get());

        menuItems.stream().forEach(item->{if(item.getText().equals(menuOption)){actions.moveToElement(item).perform();}});
        subMenuItems.stream().forEach(subItem->{if(subItem.getText().equals(subMenuOption)){subItem.click();}});
    }

}