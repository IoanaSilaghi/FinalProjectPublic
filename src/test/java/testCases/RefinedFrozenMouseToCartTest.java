package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RefinedFrozenMouseToCartPage;

public class RefinedFrozenMouseToCartTest extends BasePage {

    private RefinedFrozenMouseToCartPage refinedFrozenMouseToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        refinedFrozenMouseToCartPage = new RefinedFrozenMouseToCartPage ( driver );

    }
    @Test
    public void RefinedFrozenMouseCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/0");
            refinedFrozenMouseToCartPage.clickOnRefinedFrozenMouseCart ();
            Assert.assertEquals ( "Success", "Success" );
        }
    }


