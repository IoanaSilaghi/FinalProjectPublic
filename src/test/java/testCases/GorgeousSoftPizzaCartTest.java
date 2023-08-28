package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.GorgeousSoftPizzaCartPage;

public class GorgeousSoftPizzaCartTest extends BasePage {
    private GorgeousSoftPizzaCartPage gorgeousSoftPizzaCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        gorgeousSoftPizzaCartPage = new GorgeousSoftPizzaCartPage ( driver );
    }

    @Test
    public void GorgeousPizzaCart() {
    gorgeousSoftPizzaCartPage.clickOnGorgeousSoftPizzaCart ();

    }
}


