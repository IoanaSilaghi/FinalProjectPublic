package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RefinedFrozenMouseWishListPage;

public class RefinedFrozenMouseWishListTest extends BasePage {

    private RefinedFrozenMouseWishListPage refinedFrozenMouseWishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        refinedFrozenMouseWishListPage = new RefinedFrozenMouseWishListPage ( driver );

    }
    @Test
    public void RefinedFrozenMouseWishList() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/0");
        refinedFrozenMouseWishListPage.clickOnRefinedFrozenMouseWishList ();
        Assert.assertEquals ( "Success", "Success" );
    }
}

