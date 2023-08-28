package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class SearchPage extends BasePage {

        public SearchPage(WebDriver driver) {
            super(driver);
        }

        static By SearchPage  = By.id("input-search");


        public static void clickOnSearchPage() {

            driver.findElement(SearchPage).click();
        }
    }
