package com.ebay.pages;

import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class SignInPage extends TestBase {



    @FindBy(id="switch-account-anchor")
    private WebElement switchAccount;

    public void clickOnSwitchAccount(){
        switchAccount.click();
    }

    @FindBy(id="userid")
    private WebElement emailOrUserNameField;

    public void typeOnEmailOrUserNameField(String data){
        emailOrUserNameField.sendKeys(data);
    }

    @FindBy(id="pass")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
    }

    @FindBy(id="sgnBt")
    private WebElement signInButton;

    public void clickOnSignInButton(){
        signInButton.click();
    }



}
