package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement orangeHRMLogo;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminTab;

    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    WebElement PIMTab;

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveTab;

    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashBoardTab;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomText;

    public void clickOnAdminTab(){
        clickOnElement(adminTab);
    }
    public void clickOnPIMTab(){
        clickOnElement(PIMTab);
    }
    public void clickOnLeaveTab(){
        clickOnElement(leaveTab);
    }
    public void clickOnDashBoardTab(){
        clickOnElement(dashBoardTab);
    }
    public String  getWelcomeText(){
        return getTextFromElement(welcomText);
    }
    public boolean  getLogo(){
        return verifyThatElementIsDisplayed(orangeHRMLogo);

    }


}
