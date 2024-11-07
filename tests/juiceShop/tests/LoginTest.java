package juiceShop;
import frameworkUtils.Selectors;
import frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import juiceShop.pages.LoginPage;
import juiceShop.pages.LoginPagePF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LoginTest {

    static final String baseUrl = Utils.getConfigProperty("baseUrl");
    WebDriver driver;

    @BeforeMethod
    public void initBrowser() {
        //OLD version!Do not use unless the server you are testing does not have internet
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Ioana\\Downloads\\chromedriver.exe");
        driver = Utils.getDriver();
    }

    @Test
    public void mainPage() {
        driver.get(baseUrl);
        WebElement pageText = driver.findElement(By.cssSelector(Selectors.ALL_PRODUCTS_SELECTOR));
        Assert.assertEquals(pageText.getText(),"All Products");
    }

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp(){
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"alex@alex.com","Alex98876%","alex"});
        return dp.iterator();
    }


    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister(String username, String password, String securityAns){
        driver.get(baseUrl + "#/login");

        WebElement dismissModalElement = Utils.waitForElement(driver, 5,
                By.cssSelector(Selectors.MODAL_OK_BUTTON));
        dismissModalElement.click();

        WebElement registerLink = driver.findElement(By.cssSelector(Selectors.REGISTER_URL));
        registerLink.click();

        Assert.assertEquals(driver.findElement(By.cssSelector(Selectors.REGISTER_HEADER)).getText(),"User Registration");

        WebElement usernameElement = driver.findElement(By.id(Selectors.REGISTER_EMAIL));
        usernameElement.clear();
        usernameElement.sendKeys("alex@alex.com");

        WebElement passwordElement = driver.findElement(By.id(Selectors.REGISTER_PASSWORD));
        passwordElement.clear();
        passwordElement.sendKeys("Alex98765$");

        WebElement passwordConfirm = driver.findElement(By.id(Selectors.REGISTER_CONFIRM));
        passwordConfirm.clear();
        passwordConfirm.sendKeys("Alex98765$");

        WebElement securityQuestion = Utils.waitForElement(driver, 5,
                By.cssSelector(Selectors.SECURITY_QUESTION)
        );
        securityQuestion.click();

        WebElement securityQustionChoice = driver.findElement(By.cssSelector(Selectors.SECURITY_OPTION1));
        securityQustionChoice.click();

        WebElement securityAnswers = driver.findElement(By.cssSelector(Selectors.SECURITY_ANSWER));
        securityAnswers.click();
        securityAnswers.sendKeys("Alex");

        WebElement submitButton  = driver.findElement(By.id(Selectors.REGISTER_SUBMIT_BUTTON));
        submitButton.click();

    }

    @Test
    public void login01() {
        driver.get(baseUrl + "#/login");
        LoginPage lp = new LoginPage(driver);
        lp.awaitDismissModal();
        lp.login("alex@alex.com","Onert123$");

    }
    ///////// this is with Page Factory
    @Test
    public void login02(){
        driver.get(baseUrl + "#/login");
        LoginPagePF lp = new LoginPagePF(driver);
        lp.dismissModalWait();
        // Best practice is to have the Asserts in tests
        Assert.assertEquals(lp.getLoginText(),lp.getStaticLoginText());
        lp.login("alex@alex.com","Onert123$");


    }

    @AfterMethod
    public void closeBrowser() {
        try {
            driver.close();
        } catch (Exception ex) {
            driver.quit();
        }
    }
}
