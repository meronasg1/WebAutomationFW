package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage {


    @FindBy(id="twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id="nav-search-submit-button")
    private WebElement searchButton;

    public void typeOnSearchBar (String bookName){
        searchTextBox.sendKeys(bookName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    @FindBy(xpath="//span[@class='hm-icon-label']")
    private WebElement allButton;

    public void clickOnAllButton(){
        allButton.click();
    }

    @FindBy(linkText="Best Sellers")
    private WebElement bestSellersButton;

    public void clickOnBestSellersButton(){
        bestSellersButton.click();
    }

    @FindBy(linkText = "Customer Service")
    private WebElement customerServiceButton;

    public void clickOnCustomerServiceButton(){
        customerServiceButton.click();
    }

    @FindBy(linkText="New Releases")
    private WebElement newReleases;

    public void clickOnNewReleases(){
        newReleases.click();
    }

    @FindBy(linkText="Today's Deals")
    private WebElement todaysdeals;

    public void clickOnTodaysDeals(){
        todaysdeals.click();
    }

    @FindBy(linkText="Books")
    private WebElement books;

    public void clickOnBooks(){
        books.click();
    }

    @FindBy(linkText="Pharmacy")
    private WebElement pharmacy;

    public void clickOnPharmacy(){
        pharmacy.click();
    }

    @FindBy(linkText="Fashion")
    private WebElement fashion;

    public void clickOnFashion(){
        fashion.click();
    }

    @FindBy(linkText="Kindle Books")
    private WebElement kindleBooks;

    public void clickOnKindleBooks(){
        kindleBooks.click();
    }

    @FindBy(linkText ="Toys & Games")
    private WebElement toysAndGames;

    public void clickOnToysAndGames(){
        toysAndGames.click();
    }

    @FindBy(linkText="Gift Cards")
    private WebElement giftCards;

    public void clickOnGiftCards(){
        giftCards.click();
    }

    @FindBy(linkText="Amazon Home")
    private WebElement amazonHome;

    public void clickOnAmazonHome(){
        amazonHome.click();
    }

    @FindBy(linkText= "//a[@data-csa-c-content-id='nav_cs_registry_93b1f2f95895470fabc376fd50b3cce8']")
    private WebElement registry;


    //The dropdown thing covers registry before it can be clicked on
    public void clickOnRegistry(){
        registry.click();
    }

    @FindBy(linkText="Sell")
    private WebElement sell;

    public void clickOnSell(){
        sell.click();
    }

    @FindBy(id= "nav-logo-sprites")
    private WebElement amazon;

    public void clickOnAmazon(){
        amazon.click();
    }

    @FindBy(xpath="(//span[@class='nav-icon nav-arrow'])[4])")
    private WebElement prime;

    public void clickOnPrime(){
        prime.click();
    }

    @FindBy(xpath="//select[@aria-describedby='searchDropdownDescription']")
    private WebElement searchDropDown;

    public void selectSearchDropDownBooks(String visibleText){
        Select select = new Select(searchDropDown);
        select.selectByVisibleText(visibleText);
    }

    @FindBy(id="nav-link-accountList-nav-line-1")
    private WebElement signInButton;

    public void clickSignInButton(){
        signInButton.click();
    }

    @FindBy(xpath="(//span[@class='nav-line-1'])[2]")
    private WebElement returnsAndOrders;

    public void clickReturnsAndOrders(){
        returnsAndOrders.click();
    }

    @FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
    private WebElement cart;

    public void clickOnCart(){
        cart.click();
    }

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBox;

    public void typeOnSearchBox(String data){
        searchBox.sendKeys(data);
    }

    @FindBy(id="nav-search-submit-button")
    private WebElement searchBtn;

    public void clickOnSearchBtn(){
        searchBtn.click();
    }



}
