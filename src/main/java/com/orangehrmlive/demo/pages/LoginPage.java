package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanelText;
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement profileLogo;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logOutButton;



    public void enterUserName(String name){
        sendTextToElement(userNameField,name);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void loginToApplication(String name,String password){
        enterUserName(name);
        enterPassword(password);
        clickOnLoginButton();
    }
    public void clickOnProfileLogo(){
        clickOnElement(profileLogo);
    }
    public void mouseHoverAndClickOnLogOutButton(){
        mouseHoverToElementAndClick(logOutButton);
    }
    public String getLogInPanelText(){
        return getTextFromElement(loginPanelText);
    }
}
