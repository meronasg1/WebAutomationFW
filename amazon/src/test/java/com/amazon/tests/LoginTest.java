package com.amazon.tests;

import com.amazon.data.DataProvidersForTest;
import com.amazon.pages.HomePage;
import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.SignInPage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    private HomePage homePage;
    private SignInPage signInPage;
    private CreateAccountPage registrationPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage=PageFactory.initElements(driver, HomePage.class);
        signInPage=PageFactory.initElements(driver,SignInPage.class);
        registrationPage=PageFactory.initElements(driver, CreateAccountPage.class);
    }



    @Test(dataProviderClass = DataProvidersForTest.class, dataProvider = "dataForLoginTest")
    public void loginTestCase (String name, String email, String password){

        homePage.clickSignInButton();
        ExtentTestManager.log("clicked on sign in button", LOGGER);
        signInPage.typeOnEmailOrMobilePhoneNumberField();
        ExtentTestManager.log(email+"typed on email field", LOGGER);
        signInPage.clickOnContinueButton();
        ExtentTestManager.log("clicked on continue button", LOGGER);
        signInPage.typeOnPasswordField();
        ExtentTestManager.log(password+"typed on password field", LOGGER);
        signInPage.clickOnSignInButton();
        ExtentTestManager.log("clicked on sign in button", LOGGER);

    }






}
