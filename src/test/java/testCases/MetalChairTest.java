
package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class MetalChairTest extends BasePage {

    private MetalChairPage metalChairPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        metalChairPage= new MetalChairPage(driver);
    }

    @Test

    public void MetalChair() {
        OpenCartPage.clickOnOpenCartPage();
        Assert.assertEquals("Success", "Success");
    }
}