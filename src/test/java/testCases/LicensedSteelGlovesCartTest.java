package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LicensedSteelGlovesCartPage;

public class LicensedSteelGlovesCartTest extends BasePage {

    private LicensedSteelGlovesCartPage licensedSteelGlovesCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        licensedSteelGlovesCartPage = new LicensedSteelGlovesCartPage ( driver );
    }

    @Test

    public void LicensedSteelGloves() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/8");
        licensedSteelGlovesCartPage.clickOnLicensedSteelGlovesCart ();

    }
}
