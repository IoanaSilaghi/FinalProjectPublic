package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class GraniteTest extends BasePage {

    private GranitePage granitePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        granitePage= new GranitePage(driver);
    }

    @Test

    public void Granite() {
        GranitePage.clickOnGranitePage();
        Assert.assertEquals("Success", "Success");
    }
}