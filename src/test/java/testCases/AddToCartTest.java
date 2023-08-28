package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.BasePage;


public class AddToCartTest extends BasePage{


    private AddToCartPage addToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        addToCartPage = new AddToCartPage ( driver );
    }

    @Test
    public void AddToCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/9");
        addToCartPage.clickOnCheckBox ();

    }
}