package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;

import pages.SearchPage;
import pages.SortByNamePage;
import pages.SortByPricePage;

public class SortByPriceTest extends BasePage {

    private SortByPricePage sortByPricePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        sortByPricePage = new SortByPricePage(driver);
    }

    @Test


        public void SortByPricePage() {
            pages.SortByPricePage.clickOnSortByPrice();
            String expectedText = "Sort by price (low to high)";
            WebElement resultText = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select/option[3]"));
            //String actualText = resultText.getText();

            Assert.assertEquals(expectedText, "Sort by price (low to high)");
        }
    }

