package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {
LoginPage loginPage;
AdminPage adminPage;
AddUserPage addUserPage;
HomePage homePage;
ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage=new LoginPage();
        adminPage=new AdminPage();
        addUserPage=new AddUserPage();
        homePage=new HomePage();
        viewSystemUsersPage=new ViewSystemUsersPage();

    }
    @Test(groups = {"sanity","smoke","regression"})
    public void adminShouldAddUserSuccessFully(){
        loginPage.loginToApplication("Admin","admin123");
        homePage.clickOnAdminTab();
        String expectedText="System Users";
       String actualText=viewSystemUsersPage.getSystemUserText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
        viewSystemUsersPage.clickOnAddButton();
        String expectedAddUserText="Add User";
        String actualAddUserText=addUserPage.getAddUserText();
        Assert.assertEquals(expectedAddUserText,actualAddUserText,"Text not match");
        addUserPage.selectUserRole("Admin");
        addUserPage.enterEmployeeName("Ananya Dash");
        addUserPage.enterUserName("Ananya");
        addUserPage.selectStatus("Disabled");
        addUserPage.enterPassword("Dash12345");
        addUserPage.enterConfirmPassword("Dash12345");
        addUserPage.clickOnSaveButton();
    }
    @Test(groups = {"smoke","regression"})
    public void searchTheUserCreatedAndVerify(){
        loginPage.loginToApplication("Admin","admin123");
        homePage.clickOnAdminTab();
        String expectedText="System Users";
        String actualText=viewSystemUsersPage.getSystemUserText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
        viewSystemUsersPage.enterUserName("Ananya");
        viewSystemUsersPage.selectUserRole("Admin");
        viewSystemUsersPage.selectStatus("Disabled");
        viewSystemUsersPage.clickOnSearchButton();

    }
    @Test(groups = "regression")
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.loginToApplication("Admin","admin123");
        homePage.clickOnAdminTab();
        String expectedText="System Users";
        String actualText=viewSystemUsersPage.getSystemUserText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
        viewSystemUsersPage.enterUserName("Ananya");
        viewSystemUsersPage.selectUserRole("Admin");
        viewSystemUsersPage.selectStatus("Disabled");
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.clickOnDeleteButton();

    }
    @Test(groups = "regression")
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.loginToApplication("Admin","admin123");
        homePage.clickOnAdminTab();
        String expectedText="System Users";
        String actualText=viewSystemUsersPage.getSystemUserText();
        Assert.assertEquals(expectedText,actualText,"Text not displayed");
        viewSystemUsersPage.enterUserName("Ananya");
        viewSystemUsersPage.selectUserRole("Admin");
        viewSystemUsersPage.selectStatus("Disabled");
        viewSystemUsersPage.clickOnSearchButton();
        String expectedNoRecordText="No Records Found";
        String actualNoRecordText=viewSystemUsersPage.getNoRecordFoundTest();
        Assert.assertEquals(expectedNoRecordText,actualNoRecordText,"Text not displayed");


    }



}
