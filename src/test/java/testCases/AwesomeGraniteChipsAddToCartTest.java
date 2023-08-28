package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeGraniteChipsAddToCartPage;
import pages.BasePage;

public class AwesomeGraniteChipsAddToCartTest extends BasePage {

    private AwesomeGraniteChipsAddToCartPage awesomeGraniteChipsAddToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        awesomeGraniteChipsAddToCartPage = new AwesomeGraniteChipsAddToCartPage ( driver );
    }


    @Test
    public void GraniteAddToCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/1");
        awesomeGraniteChipsAddToCartPage.clickOnGraniteCheckBox ();

    }
    }
