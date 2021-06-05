package keyworddrivenexample;

import keyworddrivenexample.EventCase;
import org.testng.annotations.Test;

public class KeyWordDrivenTest {

    @Test
    public void keywordtest(){
        EventCase eventCase = new EventCase();
        eventCase.functionEventCase("goToSignInPage");
        eventCase.functionEventCase("goToCreateAccountPage");
    }
}
