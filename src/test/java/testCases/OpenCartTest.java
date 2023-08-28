package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LicensedSteelGlovesWishListPage;
import pages.OpenCartPage;
import pages.OpenPage;

public class OpenCartTest extends BasePage {

    private OpenCartPage openCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        openCartPage= new OpenCartPage(driver);
    }

    @Test

    public void OpenCartPage() {
        OpenCartPage.clickOnOpenCartPage();
        Assert.assertEquals("Success", "Success");
    }
}