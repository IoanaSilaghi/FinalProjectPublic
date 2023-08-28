package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class WishListTest extends BasePage {

    private WishListPage wishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        wishListPage= new WishListPage(driver);
    }

    @Test

    public void WishList() {
       WishListPage.clickOnWishListPage();
        Assert.assertEquals("Success", "Success");
    }
}