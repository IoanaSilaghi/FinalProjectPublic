package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.OpenCartPage;

public class LoginTest extends BasePage {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginPage= new LoginPage(driver);
    }

    @Test

    public void Login() {


        driver.manage().window().maximize();

        LoginPage.clickOnOLogInPage();

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));

        WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button"));

        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        login.click();


    }
}