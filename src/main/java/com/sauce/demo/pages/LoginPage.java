package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By Username = By.id("user-name");
    By Password = By.id("password");
    By LoginButton = By.xpath("//input[@id='login-button']");
    By VerifyProducts = By.xpath("//span[@class='title']");


    public void enterUsername(String UsernameText){
        sendTextToElement(Username,UsernameText);
    }
    public void enterPassword(String PasswordText){
        sendTextToElement(Password,PasswordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(LoginButton);
    }

    public String verifyProduct() {
        return getTextFromElement(VerifyProducts);
    }


    }


