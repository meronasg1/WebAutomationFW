package com.amazon.tests;
import com.amazon.data.DataProvidersForTest;
import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.aventstack.extentreports.ExtentTest;
import com.pnt.base.ConnectDB;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import jdk.jfr.Enabled;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SearchTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(SearchTest.class);

    private HomePage homePage;
    private CreateAccountPage createAccountPage;
    private SignInPage signInPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage=PageFactory.initElements(driver, HomePage.class);
        createAccountPage=PageFactory.initElements(driver, CreateAccountPage.class);
        signInPage=PageFactory.initElements(driver, SignInPage.class);
    }


    @Test(enabled = false)
    public void validateUserBeingAbleToSearchForAnItem() {

        homePage.typeOnSearchBar("Java book");
        homePage.clickOnSearchButton();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Books");
        ExtentTestManager.log("Java Books typed in the search bar", LOGGER);

        driver.findElement(By.id("nav-search-submit-button")).click();
        ExtentTestManager.log("Clicked on the search button", LOGGER);

    }



    //data provider
    @Test(dataProviderClass = DataProvidersForTest.class, dataProvider="getDataForSearchTest")
    public void validateUserBeingAbleToSearchForAnItemUsingPageObjectModel(String bookName) {

        homePage.typeOnSearchBar(bookName);
        ExtentTestManager.log(bookName+"typed in the search bar", LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on the search button", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSearchForSeleniumBooks() {

        homePage.typeOnSearchBar("Selenium Books");
        ExtentTestManager.log("Selenium books typed in search bar", LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on the searchbutton", LOGGER);
    }


    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnAllButton() {

        homePage.clickOnAllButton();
        ExtentTestManager.log("Clicked on All Button", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnBestSellersButton() {

        homePage.clickOnBestSellersButton();
        ExtentTestManager.log("Clicked on Sellers Button", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnCustomerServiceButton() {

        homePage.clickOnCustomerServiceButton();
        ExtentTestManager.log("Clicked on customer service button", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnNewReleases() {

        homePage.clickOnNewReleases();
        ExtentTestManager.log("Clicked on New Releases Button", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnTodaysDeals() {

        homePage.clickOnTodaysDeals();
        ExtentTestManager.log("Clicked on Today's deals", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnBooks() {

        homePage.clickOnBooks();
        ExtentTestManager.log("Clicked on Books", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnPharmacy() {

        homePage.clickOnPharmacy();
        ExtentTestManager.log("clicked on pharmacy", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnFashion() {

        homePage.clickOnFashion();
        ExtentTestManager.log("clicked on fashion", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnKindleBooks() {

        homePage.clickOnKindleBooks();
        ExtentTestManager.log("clicked on kindle Books", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnToysAndGames() {

        homePage.clickOnToysAndGames();
        ExtentTestManager.log("Clicked on Toys and Games", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnGiftCards() {

        homePage.clickOnGiftCards();
        ExtentTestManager.log("Clicked on gift cards", LOGGER);
    }


    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnAmazonHome() {

        homePage.clickOnAmazonHome();
        ExtentTestManager.log("Clicked on Amazon Home", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnRegistry() {
        // creating an object of the class homepage(homepage "theoretically" contains all the locators found in that homepage

        homePage.clickOnRegistry();
        ExtentTestManager.log("Clicked on registry", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSell() {

        homePage.clickOnSell();
        ExtentTestManager.log("clicked on sell", LOGGER);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnAmazon() {

        homePage.clickOnAmazon();
        ExtentTestManager.log("clicked on amazon", LOGGER);
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToSelectBooksFromSearchDropDown() {

        homePage.selectSearchDropDownBooks("Books");
        ExtentTestManager.log("Selected books from the search dropdown ", LOGGER);
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToSelectWomenFromSearchDropDown() {

        homePage.selectSearchDropDownBooks("Clothing, Shoes & Jewlery");
        ExtentTestManager.log("Selected books from the search dropdown ", LOGGER);
    }

    @Test(enabled=true)
    public void validateUserBeingAbleToScrollAmazonHompage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windowScrollBy(0,100)");
        ExtentTestManager.log("scrolled amazon homepage", LOGGER);
    }

    @Test(enabled = true)
    public void validateUserBeingAbleToSearchForAnItemFromDatabase() throws SQLException {
        String query = "select * from testdata;";
        ArrayList<String> datas = ConnectDB.connectToDbAndGetData(query, "bookName");

        homePage.typeOnSearchBar(datas.get(0));
        ExtentTestManager.log("Java Books typed in the search bar", LOGGER);

        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on the search button", LOGGER);

    }

}
