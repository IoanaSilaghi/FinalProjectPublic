package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeSoftShirtAddToCartPage;
import pages.BasePage;

public class AwesomeSoftShirtAddToCartTest extends BasePage {

    private AwesomeSoftShirtAddToCartPage awesomeSoftShirtAddToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        awesomeSoftShirtAddToCartPage = new AwesomeSoftShirtAddToCartPage ( driver );
    }
    @Test
    public void AwesomeSoftShirtCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/5");
        awesomeSoftShirtAddToCartPage.clickOnAwesomeSoftShirtCart ();

    }
}
