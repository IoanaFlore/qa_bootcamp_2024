package homeworkDemoSite.tests;

import homeworkDemoSite.pages.LoginPage;
import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void login01() {
        driver.get(baseUrl);
        Utils.waitForElement(driver,5, By.cssSelector("#svelte > div.container-fluid > div.header.sticky-top.row > div:nth-child(2) > div > a > h2 > i")).click();
        LoginPage lp = new LoginPage(driver);
        lp.login("ioana99","ioanaflore99");
    }
}
