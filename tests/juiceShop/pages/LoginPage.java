package pages;

import frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;

    private static final String LOGIN_TEXT_SELECTOR = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1";//ID
    private static final String USERNAME_SELECTOR = "email";
    private static final String PASSWORD_SELECTOR = "password";
    private static final String SUBMIT_SELECTOR = "loginButton";
    private static final String NOT_REGISTER_SELECTOR = "#newCustomerLink > a";
    private static final String MODAL_SELECTOR = "#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon";
    private static final String LOGIN_TEXT_VALUE = "Login";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password){
        WebElement emailField = driver.findElement(By.id(USERNAME_SELECTOR));
        WebElement passwordField = driver.findElement(By.id(PASSWORD_SELECTOR));
        WebElement loginText = driver.findElement(By.id(LOGIN_TEXT_SELECTOR));

        Assert.assertEquals(loginText.getText(),loginText);
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement submitButton = driver.findElement(By.id(SUBMIT_SELECTOR));
        submitButton.click();

    }
    public void dismissModal(){
        WebElement modalElement = driver.findElement(By.cssSelector(MODAL_SELECTOR));
        modalElement.click();
    }
    public void awaitDismissModal(){
        Utils.waitForElement(driver,10, By.cssSelector(MODAL_SELECTOR)).click();
    }
    public void newUser(){
        WebElement newUserLink = driver.findElement(By.cssSelector(NOT_REGISTER_SELECTOR));
        newUserLink.click();
    }


}
