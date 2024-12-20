package juiceShop.pages;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

    private WebDriver driver;

    private static final String LOGIN_TEXT_SELECTOR = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1";//ID
    private static final String USERNAME_SELECTOR = "email";
    private static final String PASSWORD_SELECTOR = "password";
    private static final String SUBMIT_SELECTOR = "loginButton";
    private static final String NOT_REGISTER_SELECTOR = "#newCustomerLink > a";
    private static final String MODAL_SELECTOR = "#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon";

    private static final String LOGIN_TEXT_VALUE = "Login";

    // first solution
    @FindBy(css = LOGIN_TEXT_SELECTOR)
    WebElement loginTextHeader; // adnotare de selenium 4
    //// same
    // second solution
    @FindBy(how = How.CSS, using = LOGIN_TEXT_SELECTOR)
    WebElement loginTextHeader2; // adnotare de selenium 3

    @FindBy(id = USERNAME_SELECTOR)
    WebElement usernameField;

    @FindBy(id = PASSWORD_SELECTOR)
    WebElement passwordField;

    @FindBy(id = SUBMIT_SELECTOR)
    WebElement submitButton;

    @FindBy(css = NOT_REGISTER_SELECTOR)
    WebElement newUserLink;

    @FindBy(css = MODAL_SELECTOR)
    WebElement modalButton;

    public LoginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void login(String username, String password){
 //       Assert.assertEquals(loginTextHeader.getText(),loginTextValue);
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        submitButton.click();
    }
    //PF pur
    public void dismissModal(){
        modalButton.click();
    }
    // PF hibrid, ca sa functioneze tot timpu
    public void dismissModalWait(){
        Utils.waitForElement(driver,10, By.cssSelector(MODAL_SELECTOR)).click();
    }
    public void newUser(){
        newUserLink.click();
    }

    public String getLoginText(){
        return loginTextHeader.getText();
    }
    public String getStaticLoginText(){
        return LOGIN_TEXT_VALUE;
    }
}
