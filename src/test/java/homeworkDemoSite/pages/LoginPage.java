package homeworkDemoSite.pages;

import homeworkDemoSite.frameworkUtils.Utils;
import juiceShop.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private static final String SIGN_IN_TEXT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > h1";
    private static final String SIGN_IN_VALUE = "Sign in";
    private static final String USERNAME_SELECTOR = "#user";
    private static final String PASSWORD_SELECTOR = "#pass";
    private static final String REMEMBER_SELECTOR = "remember";
    private static final String SUBMIT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > button";
    private static final String NOT_REGISTER_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > p:nth-child(3) > div > a";

    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void login(String email, String password) {
        WebElement emailField = Utils.waitForElement(driver,10, By.cssSelector(USERNAME_SELECTOR));
        WebElement passwordField = driver.findElement(By.cssSelector(PASSWORD_SELECTOR));
        WebElement loginText = driver.findElement(By.cssSelector(SIGN_IN_TEXT_SELECTOR));

        Assert.assertEquals(loginText.getText(), SIGN_IN_VALUE);
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement rememberCheck = driver.findElement(By.id(REMEMBER_SELECTOR));
        rememberCheck.click();

        WebElement submitButton = driver.findElement(By.cssSelector(SUBMIT_SELECTOR));
        submitButton.click();

    }

    public void newUser() {
        WebElement newUserLink = Utils.waitForElement(driver,10, By.cssSelector(NOT_REGISTER_SELECTOR));
        newUserLink.click();
    }

}
