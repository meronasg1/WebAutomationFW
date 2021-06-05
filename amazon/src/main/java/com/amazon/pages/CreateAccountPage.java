package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;


import java.util.logging.Logger;

public class CreateAccountPage{

    private static Logger LOGGER = Logger.getLogger(String.valueOf(CreateAccountPage.class));

    @FindBy(id= "ap_customer_name")
    private WebElement yourNameField;

    public void typeOnYourNameField(String name){
        yourNameField.sendKeys(name);
    }

    @FindBy(id="ap_email")
    private WebElement eMail;

    public void typeOnEmailField(String email){
        eMail.sendKeys(email);
    }

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passWord;

    public void typeOnPassWordField(String password){
        passWord.sendKeys(password);
    }

    @FindBy(xpath="//input[@name='passwordCheck']")
    private WebElement reEnterPassWord;

    public void typeOnReenterPasswordField(String password){
        reEnterPassWord.sendKeys(password);
    }

    @FindBy(id="continue")
    private WebElement createYourAmazonAccount;

    public void clickOnCreateYourAmazonAccount(){
        createYourAmazonAccount.click();
    }

    // validation
    @FindBy(xpath="//label[@for='ap_customer_name']")
    private WebElement yourNameLabel;

    @FindBy(xpath="//label[@for='ap_email']")
    private WebElement emailLabel;

    @FindBy(xpath="//label[@for='ap_password']")
    private WebElement passwordLabel;

    @FindBy(xpath="//label[@for='ap_password_check']")
    private WebElement passwordCheckLabel;

    public void validateThatFieldLabelsAreDisplayed(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(yourNameLabel.getText(), "Your name");
        LOGGER.info("Name field has validated");

        softAssert.assertEquals(emailLabel.getText(), "Email");
        LOGGER.info("Email field has validated");

        softAssert.assertEquals(passwordLabel.getText(), "Password");
        LOGGER.info("Password field has validated");

        softAssert.assertEquals(passwordCheckLabel.getText(), "Re-enter password");
        LOGGER.info("Re-enter password field has validated");

        softAssert.assertAll();
    }

    public void FillAllTheFieldLabels() {
        typeInEmailField("test user");
        typeInNameField("test user");
        typeInPasswordField("test user");
        typeInReEnterPasswordField("test user");
    }

    public void typeInNameField(String data) {
        yourNameField.sendKeys(data);
    }

    public void typeInEmailField(String data) {
        eMail.sendKeys(data);
    }

    public void typeInPasswordField(String data) {
        passWord.sendKeys(data);
    }

    public void typeInReEnterPasswordField(String data) {
        reEnterPassWord.sendKeys(data);
    }

}
