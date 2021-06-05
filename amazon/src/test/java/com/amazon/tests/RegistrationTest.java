package com.amazon.tests;

import com.amazon.data.DataProvidersForTest;
import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(RegistrationTest.class);

    CreateAccountPage createAccountPage;
    HomePage homePage;
    SignInPage signInPage;
    @BeforeMethod
    public void setUpPOM(){
        createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver,SignInPage.class);
    }
    @Test(dataProviderClass= DataProvidersForTest.class, dataProvider= "getDataForNameField")
    public void validateUserBeingAbleToEnterNameInField(String name){
        homePage.clickSignInButton();
        ExtentTestManager.log("Clicked on sign in button", LOGGER);

        signInPage.clickOnCreateYourAmazonAccount();
        ExtentTestManager.log("Clicked on create you amazon account button", LOGGER);

        createAccountPage.typeOnYourNameField(name);
        ExtentTestManager.log( name + " typed in name field", LOGGER);
    }

    @Test(dataProvider = "getDataForEmailField", dataProviderClass = DataProvidersForTest.class)
    public void validateUserBeingAbleToEmailInEmailField(String email){
        homePage.clickSignInButton();
        ExtentTestManager.log("Clicked on sign in button", LOGGER);

        signInPage.clickOnCreateYourAmazonAccount();
        ExtentTestManager.log("Clicked on create your amazon account", LOGGER);

        createAccountPage.typeOnEmailField(email);
        ExtentTestManager.log("typed in email field", LOGGER);
    }

    @Test(dataProviderClass = DataProvidersForTest.class, dataProvider = "getDataForPasswordField")
    public void validateUserBeingAbleToEnterPassword(String passWord){

        homePage.clickSignInButton();
        ExtentTestManager.log("Clicked on sign in button", LOGGER);

        signInPage.clickOnCreateYourAmazonAccount();
        ExtentTestManager.log("Clicked on create your amazon account", LOGGER);

        createAccountPage.typeOnEmailField(passWord);
        ExtentTestManager.log("typeInPasswordField", LOGGER);

    }


    @Test(dataProvider = "getDataForReenterPasswordField", dataProviderClass= DataProvidersForTest.class)
    public void validateUserBeingAbleToRenterPassword(String password){

        homePage.clickSignInButton();
        ExtentTestManager.log("Clicked on sign in button", LOGGER);

        signInPage.clickOnCreateYourAmazonAccount();
        ExtentTestManager.log("Clicked on create your amazon account", LOGGER);

        createAccountPage.typeOnEmailField(password);
        ExtentTestManager.log(password+ "type in reenter password field",LOGGER);

    }

    // a completed testcase with action, log and validation
    @Test(dataProvider = "dataForLoginTest", dataProviderClass = DataProvidersForTest.class)
    public void validateUserCanCreateAccount(String name, String email, String password){

        homePage.clickSignInButton();//action
        ExtentTestManager.log("Clicked on sign in button", LOGGER);//log
        //Question: validation code not working. It's failing the testcases
        signInPage.validateSignInLogoIsDisplayed();//validation

        signInPage.clickOnCreateYourAmazonAccount(); //action
        ExtentTestManager.log("Clicked on create your amazon account", LOGGER);//log
//        createAccountPage.validateThatFieldLabelsAreDisplayed();// validation

        //Question: how do I validate that the keys have been sent
        createAccountPage.typeOnYourNameField(name);
        ExtentTestManager.log(name+"typed in name field", LOGGER);

        createAccountPage.typeOnEmailField(email);
        ExtentTestManager.log(email+"typed in email field", LOGGER);

        createAccountPage.typeOnPassWordField(password);
        ExtentTestManager.log(password+"typed in password field", LOGGER);

        createAccountPage.typeOnReenterPasswordField(password);
        ExtentTestManager.log(password+ "typed in re-enter password field", LOGGER);


    }
}
