package juiceShop;

import frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    static final String baseUrl = "http://57.151.123.81:3000";
    WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        //OLD version!Do not use unless the server you are testing does not have internet
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Ioana\\Downloads\\chromedriver.exe");
        driver = Utils.getDriver();

    }

    @Test
    public void mainPage() {
        driver.get(baseUrl);
    }

    @Test
    public void login01() {

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl + "#/login");

        WebElement loginElement = driver.findElement(By.id("email"));
        loginElement.sendKeys("alex@alex.com");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Abc123$");

        WebElement submitButton = driver.findElement(By.id("loginButton"));
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
