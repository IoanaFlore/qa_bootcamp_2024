package homeworkDemoSite.tests;

import homeworkDemoSite.pages.LoginPage;
import juiceShop.frameworkUtils.Utils;
import homeworkDemoSite.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegisterTest extends BaseTest{
    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp () {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {"ioana99", "ioanaflore99", "ioanaflore99","Ioana","Marincas","ioa@gmail.com","10/03/1999"});
        return dp.iterator();
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister1(String username, String password, String confirmPassword, String firstName,
                               String lastName, String email, String dateOfBirth) {
        driver.get(baseUrl);
        Utils.waitForElement(driver,5, By.cssSelector("#svelte > div.container-fluid > div.header.sticky-top.row > div:nth-child(2) > div > a > h2 > i")).click();
        LoginPage lp = new LoginPage(driver);;
        lp.newUser();
        RegistrationPage rp = new RegistrationPage(driver);
        rp.register(username, password, confirmPassword,firstName,lastName,email, dateOfBirth);
    }

}
