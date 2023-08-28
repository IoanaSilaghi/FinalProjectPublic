package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GranitePage extends BasePage {

    public GranitePage(WebDriver driver) {
        super(driver);
    }

    static By GranitePage = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");

    public static void clickOnGranitePage() {
        driver.findElement(GranitePage).click();
    }
}