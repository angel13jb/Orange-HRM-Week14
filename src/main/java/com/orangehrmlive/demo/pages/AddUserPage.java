package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
            WebElement employeeName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;
    @FindBy(xpath = "//select[@id='systemUser_status']")
            WebElement statusDropDown;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
            WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;
    @FindBy(xpath = "//input[@id='btnCancel']")
            WebElement cancleButton;

    public String getAddUserText(){
        return getTextFromElement(addUserText);
    }
    public void selectUserRole(String userRole){
        selectByVisibleTextFromDropDown(userRoleDropDown,userRole);
    }
    public void enterEmployeeName(String ename){
        sendTextToElement(employeeName,ename);

    }
    public void enterUserName(String username){
        sendTextToElement(userName,username);

    }
    public void selectStatus(String status){
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }
    public void enterPassword(String pword){
        sendTextToElement(password,pword);

    }
    public void enterConfirmPassword(String cpassword){
        sendTextToElement(confirmPassword,cpassword);

    }
    public void clickOnSaveButton(){
        clickOnElement(saveButton);

    }
    public void clickOnCancleButton(){
        clickOnElement(cancleButton);

    }

}
