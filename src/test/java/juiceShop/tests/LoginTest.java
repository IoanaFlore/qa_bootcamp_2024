package juiceShop.tests;

import juiceShop.pages.LoginPage;
import juiceShop.pages.LoginPagePF;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    @Test
    public void login01() {
        driver.get(baseUrl + "#/login");
        LoginPage lp = new LoginPage(driver);
        lp.awaitDismissModal();
        lp.login("alex@alex.com","Qwert123$");

    }
    ///////// this is with Page Factory
    @Test
    public void login02(){
        driver.get(baseUrl + "#/login");
        LoginPagePF lp = new LoginPagePF(driver);
        lp.dismissModalWait();
        // Best practice is to have the Asserts in tests
        Assert.assertEquals(lp.getLoginText(),lp.getStaticLoginText());
        lp.login("alex@alex.com","Qwert123$");


    }


}
