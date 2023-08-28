package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    static By WishListPage = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[2]");

    public static void clickOnWishListPage() {
        driver.findElement(WishListPage).click();
    }
}