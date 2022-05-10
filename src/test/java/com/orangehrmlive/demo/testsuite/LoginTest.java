package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    AdminPage adminPage;
    AddUserPage addUserPage;
    HomePage homePage;
    ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        addUserPage = new AddUserPage();
        homePage = new HomePage();
        viewSystemUsersPage = new ViewSystemUsersPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Welcome";
        String actualText = homePage.getWelcomeText().substring(0,7);
        Assert.assertEquals(expectedText, actualText, "Text not displayed");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {
        loginPage.loginToApplication("Admin", "admin123");
        String expectedText = "OrangeHRM";
        boolean actualText = homePage.getLogo();
        Assert.assertTrue(actualText,expectedText);
    }
    @Test(groups =  "regression")
    public void verifyUserShouldLogOutSuccessFully() {
        loginPage.loginToApplication("Admin", "admin123");
        loginPage.clickOnProfileLogo();
        loginPage.mouseHoverAndClickOnLogOutButton();
        String expectedText="LOGIN Panel";
        String actualText=loginPage.getLogInPanelText();
        Assert.assertEquals(expectedText,actualText,"text not match");

}}
