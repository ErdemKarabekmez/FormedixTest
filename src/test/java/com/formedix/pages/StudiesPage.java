package com.formedix.pages;

import com.formedix.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.stream.Collectors;

public class StudiesPage extends BasePage{


    /**
     * Locators
     */

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



    /**
     * Methods
     */

    /**
     * This method is getting 'Tech Study' menu options and putting in a list as a String and returning that list
     */
    public List<String> getTechStudyOptions() {

        techStudyMenu.click();
        BrowserUtils.waitForClickablility(View,10);
        List<String> options = viewList.stream().map(p->p.getText()).collect(Collectors.toList());

        return options;
    }
}
