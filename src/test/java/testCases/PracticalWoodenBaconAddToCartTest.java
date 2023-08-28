package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.PracticalWoodenBaconAddToCartPage;

public class PracticalWoodenBaconAddToCartTest extends BasePage {

    private PracticalWoodenBaconAddToCartPage practicalWoodenBaconAddToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        practicalWoodenBaconAddToCartPage = new PracticalWoodenBaconAddToCartPage ( driver );
    }

    @Test

    public void PracticalWoodenBaconCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/4");
        practicalWoodenBaconAddToCartPage.clickOnPracticalWoodenBaconCart ();
    }
}

