package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SortByNamePage extends BasePage {

    public SortByNamePage(WebDriver driver) {
        super(driver);
    }

    static By SortByNamePage  = By.xpath("");


    public static void clickOnSortByName() {

        driver.findElement(SortByNamePage).click();
    }
}
