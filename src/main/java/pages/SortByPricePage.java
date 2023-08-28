package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;


public class SortByPricePage extends BasePage {

    public SortByPricePage(WebDriver driver) {
        super(driver);
    }

    static By SortByPricePage  = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select");


    public static void clickOnSortByPrice() {

        driver.findElement(SortByPricePage).click();
    }


    }
