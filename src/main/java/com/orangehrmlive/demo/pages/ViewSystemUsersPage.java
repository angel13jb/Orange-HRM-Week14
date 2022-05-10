package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'System Users')]")
    WebElement systemUserText;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userNameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRollDropDown;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeNameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDown;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButton;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordFoundText;

    public String getSystemUserText(){
        return getTextFromElement(systemUserText);
    }
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public void enterUserName(String username){
        sendTextToElement(userNameField,username);
    }
    public void selectUserRole(String userrole){
        selectByVisibleTextFromDropDown(userRollDropDown,userrole);
    }
    public void selectStatus(String status){
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
    public String getNoRecordFoundTest(){
        return getTextFromElement(noRecordFoundText);
    }
}
