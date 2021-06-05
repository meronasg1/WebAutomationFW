package com.ebay.pages;

import com.pnt.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class HomePage extends TestBase {

    @FindBy(linkText="Sign in")
    private WebElement signInButton;

    public void clickOnSignInButton(){
        signInButton.click();
    }

    @FindBy(linkText = "register")
    private WebElement registerButton;

    public void clickOnRegisterButton(){
        registerButton.click();
    }

    @FindBy(linkText = "Daily Deals")
    private WebElement dailyDealsButton;

    public void clickOnDailyDealsButton(){
        dailyDealsButton.click();
    }

    @FindBy(linkText = "Brand Outlet")
    private WebElement brandOutletButton;

    public void clickOnBrandOutletButton(){
        brandOutletButton.click();
    }

    @FindBy(linkText="Help & Contact")
    private WebElement helpAndContactButton;

    public void clickOnHelpAndContactButton(){
        helpAndContactButton.click();
    }

    @FindBy(id="gh-shop-a")
    private WebElement shopByCategoryDropDown;

    public void selectFromShopByCategoryDropDown(String shopByCategories){
        Select select = new Select(shopByCategoryDropDown);
        select.selectByVisibleText(shopByCategories);
    }

    @FindBy(xpath="//input[@class='gh-tb ui-autocomplete-input']")
    private WebElement searchField;

    public void typeOnSearchField(String data){
        searchField.sendKeys(data);
    }

    @FindBy(xpath="//select[@aria-label='Select a category for search']")
    private WebElement allCategoriesButton;

    public void selectFromAllCategoriesDropDown(String category){
        Select select = new Select(allCategoriesButton);
        select.selectByVisibleText(category);
    }

    @FindBy(id="gh-btn")
    private WebElement searchButton;

    public void clickOnSearchButton(){
        searchButton.click();
    }

  /*  //ask zan how to do this validation
    //validate that homepage is open
    @FindBy(xpath="(//img[@id='gh-logo'])[1]")
    private WebElement ebayLogo;

    public void validateEbayLogo(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ebayLogo.findElement(By.xpath("(//img[@id='gh-logo'])[1]")), )
    }*/






}
