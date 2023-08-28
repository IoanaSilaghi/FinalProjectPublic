package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LicensedSteelGlovesWishListPage;
import pages.OpenPage;

public class OpenPageTest extends BasePage {

    private OpenPage openPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        openPage = new OpenPage(driver);
    }

    @Test

    public void OpenPage() {
        OpenPage.clickOnOpenPage();
    }
}
