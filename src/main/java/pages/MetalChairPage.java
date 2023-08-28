package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MetalChairPage extends BasePage {

        public MetalChairPage(WebDriver driver) {
            super(driver);
        }

        static By MetalChairPage = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/a");

        public static void clickOnMetalChairPage() {
            driver.findElement(MetalChairPage).click();
        }
    }
