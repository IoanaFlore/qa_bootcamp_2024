package homeworkDemoSite.pages;

import juiceShop.frameworkUtils.Utils;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegistrationPage extends BasePage {

    private static final String SIGN_UP_USERNAME = "username";
    private static final String SIGN_UP_PASSWORD = "password";
    private static final String SIGN_UP_CONFIRM_PASSWORD = "password2";
    private static final String TITLE_OPTION2 = "Ms";
    private static final String SIGN_UP_FIRST_NAME = "input-first-name";
    private static final String SIGN_UP_LAST_NAME = "input-last-name";
    private static final String SIGN_UP_EMAIL = "input-email";
    private static final String SIGN_UP_DATE_OF_BIRTH = "input-dob";
    private static final String SIGN_UP_NATIONALITY = "input-nationality";
    private static final String SIGN_UP_NATIONALITY_OPTION_ROMANIA = "#input-nationality > option:nth-child(144)";
    private static final String SIGN_UP_ACCEPT_CONDITIONS = "terms";
    private static final String SIGN_UP_SUBMIT_BUTTON = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > div:nth-child(13) > button";


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void register(String username, String password, String confirmPassword, String firstName,
                         String lastName, String email, String dateOfBirth) {

        WebElement usernameField = Utils.waitForElement(driver,10,By.id(SIGN_UP_USERNAME));
        usernameField.clear();
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id(SIGN_UP_PASSWORD));
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement passwordConfirm = driver.findElement(By.id(SIGN_UP_CONFIRM_PASSWORD));
        passwordField.clear();
        passwordField.sendKeys(confirmPassword);
        passwordConfirm.clear();
        passwordConfirm.sendKeys(confirmPassword);

        WebElement titleCheckBox = Utils.waitForElement(driver, 10, By.id(TITLE_OPTION2));
        titleCheckBox.click();

        WebElement firstNameField = Utils.waitForElement(driver,10,By.id(SIGN_UP_FIRST_NAME));
        firstNameField.clear();
        firstNameField.sendKeys(firstName);


        WebElement lastNameField = Utils.waitForElement(driver,10, By.id(SIGN_UP_LAST_NAME));
        Utils.scrollToElement(driver,lastNameField);
        lastNameField.clear();
        lastNameField.sendKeys(lastName);

        WebElement emailField = Utils.waitForElement(driver,10,By.id(SIGN_UP_EMAIL));
        emailField.clear();
        emailField.sendKeys(email);

        WebElement dataType = driver.findElement(By.id(SIGN_UP_DATE_OF_BIRTH));
        usernameField.clear();
        usernameField.sendKeys(dateOfBirth);

        WebElement nationalityDropDown = Utils.waitForElement(driver,10, By.id(SIGN_UP_NATIONALITY));
        Utils.scrollToElement(driver,nationalityDropDown);
        Actions actions = new Actions(driver);
        actions.moveToElement(nationalityDropDown).click().perform();

        WebElement nationalityOptionRomania = Utils.waitForElement(driver,10, By.cssSelector(SIGN_UP_NATIONALITY_OPTION_ROMANIA));
        Utils.scrollToElement(driver,nationalityOptionRomania);
        nationalityOptionRomania.click();

        WebElement acceptCondiotion = Utils.waitForElement(driver, 10,By.id(SIGN_UP_ACCEPT_CONDITIONS));
        Utils.scrollToElement(driver,acceptCondiotion);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(acceptCondiotion).click().perform();

        WebElement submitButton = Utils.waitForElement(driver,10,By.cssSelector(SIGN_UP_SUBMIT_BUTTON));
        Utils.scrollToElement(driver,submitButton);
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(submitButton).click().perform();

    }

}
