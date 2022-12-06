package com.sauce.demo.testsuite;

import com.sauce.demo.pages.LoginPage;
import com.sauce.demo.testbase.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestPage extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        loginPage.verifyProduct();
        String expectedText = "PRODUCTS";
        String actualText= loginPage.verifyProduct();
        Assert.assertEquals(actualText,expectedText,"PRODUCTS");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        loginPage.verifyProduct();
        String expectedText = "PRODUCTS";
        String actualText= loginPage.verifyProduct();
        Assert.assertEquals(actualText,expectedText,"PRODUCTS");







    }


}
