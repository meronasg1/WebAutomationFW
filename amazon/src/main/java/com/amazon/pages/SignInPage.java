package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class SignInPage {

    private static Logger LOGGER = Logger.getLogger(String.valueOf(SignInPage.class));

    @FindBy(id= "ap_email")
    private WebElement emailOrMobilePhoneNumber;

    public void typeOnEmailOrMobilePhoneNumberField(){
        emailOrMobilePhoneNumber.sendKeys();
    }

    @FindBy(id="ap_password")
    private WebElement password;

    public void typeOnPasswordField(){
        password.sendKeys();
    }

    @FindBy(id="continue")
    private WebElement continueButton;

    public void clickOnContinueButton(){
        continueButton.click();
    }

    @FindBy(id="signInSubmit")
    private WebElement signIn;

    public void clickOnSignInButton(){
        signIn.click();
    }

    @FindBy(id="createAccountSubmit")
    private WebElement createYourAmazonAccount;

    public void clickOnCreateYourAmazonAccount(){
        createYourAmazonAccount.click();
    }

    //validation locators
    @FindBy(xpath="//i[@class='a-icon a-icon-logo']")
    private WebElement signInLogo;

    public void validateSignInLogoIsDisplayed(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(signInLogo.getText(),"Sign-In");
        LOGGER.info("Sign in Logo has validated");

        softAssert.assertAll();

    }



}
