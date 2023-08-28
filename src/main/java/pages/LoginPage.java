package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage extends BasePage {

        public LoginPage(WebDriver driver) {
            super(driver);
        }

         static By LoginPage = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/button");

        public static void clickOnOLogInPage() {
            driver.findElement(LoginPage).click();
        }
    }
