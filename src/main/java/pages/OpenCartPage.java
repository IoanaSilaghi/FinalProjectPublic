package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPage extends BasePage {

    public OpenCartPage(WebDriver driver) {
        super(driver);
    }

    static By OpenCartPage = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[1]");

    public static void clickOnOpenCartPage() {
        driver.findElement(OpenCartPage).click();
    }
}