package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    public DashboardPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashboardText;

    public  String getDashBoardText(){
        return getDashBoardText();
    }
}
