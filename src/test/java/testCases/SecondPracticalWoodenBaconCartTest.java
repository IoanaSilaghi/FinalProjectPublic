package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SecondPracticalWoodenBaconCartPage;

public class SecondPracticalWoodenBaconCartTest extends BasePage {


    private SecondPracticalWoodenBaconCartPage secondPracticalWoodenBaconCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        secondPracticalWoodenBaconCartPage = new SecondPracticalWoodenBaconCartPage ( driver );
    }

    @Test

    public void PracticalWoodenBaconCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/6");
        secondPracticalWoodenBaconCartPage.clickOnSecondPracticalWoodenBaconCart ();

    }
}
