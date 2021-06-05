package keyworddrivenexample;

import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.pnt.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class EventCase extends TestBase {

    public void functionEventCase(String functionName){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);

        switch(functionNames.valueOf(functionName)) {
            case goToSignInPage:
                homePage.clickSignInButton();
                break;
            case goToCreateAccountPage:
                signInPage.clickOnCreateYourAmazonAccount();
                break;
            case validateALlFieldsInCreateAccountPage:
                createAccountPage.validateThatFieldLabelsAreDisplayed();
                break;
            case fillAllFieldsInCreateAccountPage:
                createAccountPage.FillAllTheFieldLabels();
                break;

        }

    }

    public enum functionNames{
        goToSignInPage,
        goToCreateAccountPage,
        validateALlFieldsInCreateAccountPage,
        fillAllFieldsInCreateAccountPage
    }

}
