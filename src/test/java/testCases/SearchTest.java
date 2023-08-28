package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class SearchTest extends BasePage {

    private SearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        searchPage= new SearchPage(driver);
    }

    @Test

    public void SearchPage() {
        SearchPage.clickOnSearchPage();

    }
}
