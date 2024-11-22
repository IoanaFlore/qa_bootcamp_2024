package homeworkRegistration;

import homeworkRegistration.utils.Selectors;
import homeworkRegistration.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegisterTest {
    static final String baseUrl = Utils.getConfigProperty("baseUrl");
    WebDriver driver;

    @BeforeMethod
    public void initBrowser() {
        driver = Utils.getDriver();
    }

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> negativeRegister(){
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"invalid_email","invalidpassword%","invalidpassword%","ioana"});
        return dp.iterator();
    }


    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister(String username, String password, String confirmPassword, String securityAns){
        driver.get(baseUrl);
        WebElement pageText = driver.findElement(By.cssSelector(Selectors.ALL_PRODUCTS_SELECTOR));
        Assert.assertEquals(pageText.getText(),"All Products");
        WebElement overlay = Utils.waitForElement(driver, 5, By.cssSelector(".cdk-overlay-backdrop"));
        if (overlay.isDisplayed()) {
            WebElement dismissModalElement = Utils.waitForElement(driver, 5, By.cssSelector(Selectors.MODAL_OK_BUTTON));
            dismissModalElement.click();
            Utils.waitForInvisibility(driver, By.cssSelector(".cdk-overlay-backdrop"), 10);
        }


        WebElement accountButton = Utils.waitForElement(driver, 10, By.id(Selectors.ACCOUNT_BUTTON));
        accountButton.click();

        WebElement loginButton = Utils.waitForElement(driver,10,By.id(Selectors.LOGIN_BUTON));
        loginButton.click();

        WebElement registerLink = Utils.waitForElement(driver, 5,
                By.linkText(Selectors.REGISTER_URL));
        registerLink.click();

        Assert.assertEquals(driver.findElement(By.cssSelector(Selectors.REGISTER_HEADER)).getText(),"User Registration");

        WebElement usernameElement = driver.findElement(By.id(Selectors.REGISTER_EMAIL));
        usernameElement.clear();
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.id(Selectors.REGISTER_PASSWORD));
        passwordElement.clear();
        passwordElement.sendKeys(password);

        WebElement passwordConfirm = driver.findElement(By.id(Selectors.REGISTER_CONFIRM));
        passwordConfirm.clear();
        passwordConfirm.sendKeys(confirmPassword);

        WebElement securityQuestion = Utils.waitForElement(driver, 10,
                By.name(Selectors.SECURITY_QUESTION)
        );
        securityQuestion.click();

        WebElement securityQustionChoice = Utils.waitForElement(driver,10,By.xpath(Selectors.SECURITY_OPTION1));
        securityQustionChoice.click();

        WebElement securityAnswers = driver.findElement(By.cssSelector(Selectors.SECURITY_ANSWER));
        securityAnswers.click();
        securityAnswers.sendKeys(securityAns);

        WebElement submitButton  = driver.findElement(By.id(Selectors.REGISTER_SUBMIT_BUTTON));
        submitButton.click();

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
