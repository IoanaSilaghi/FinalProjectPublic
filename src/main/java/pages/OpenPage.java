package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenPage extends BasePage {

        public OpenPage(WebDriver driver) {
            super(driver);
        }

        static By OpenPage = By.id("root");

        public static void clickOnOpenPage() {
            driver.findElement(OpenPage).click();
        }
    }

