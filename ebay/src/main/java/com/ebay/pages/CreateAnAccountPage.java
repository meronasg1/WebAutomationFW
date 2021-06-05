package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage {

    @FindBy(id="firstname")
    private WebElement firstNameField;

    public void typeOnFirstNameField(String data){
        firstNameField.sendKeys(data);
    }

    @FindBy(id="lastname")
    private WebElement lastNameField;

    public void typeOnLastNameField(String data){
        lastNameField.sendKeys(data);
    }

    @FindBy(id="Email")
    private WebElement emailField;

    public void typeOnEmailField(String data){
        emailField.sendKeys(data);
    }

    @FindBy(id="password")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
    }

}
