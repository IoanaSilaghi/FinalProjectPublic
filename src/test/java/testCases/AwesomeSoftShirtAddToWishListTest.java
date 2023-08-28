package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeSoftShirtAddToWishListPage;
import pages.BasePage;

public class AwesomeSoftShirtAddToWishListTest extends BasePage {


        private AwesomeSoftShirtAddToWishListPage awesomeSoftShirtAddToWishListPage;

        @BeforeMethod
        public void setUp() {
            super.setUp ();
            awesomeSoftShirtAddToWishListPage = new AwesomeSoftShirtAddToWishListPage( driver );
        }

        @Test
        public void AwesomesoftShiftWishList() {
            driver.get ( "https://fasttrackit-test.netlify.app/#/product/5" );
            awesomeSoftShirtAddToWishListPage.clickOnAwesomeSoftShirtWishList ();

        }
    }

