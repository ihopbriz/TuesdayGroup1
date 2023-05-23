package tests;

import common.BasePage;
import common.BaseTest;
import org.junit.jupiter.api.Test;
import pages.TestStoreHomePage;

public class SearchStoreTest extends BaseTest {

    @Test
    public void searchEntry() {
        //Home Page
        TestStoreHomePage testStoreHomePage = new TestStoreHomePage(driver);
        testStoreHomePage.enterSearchItem("shampoo");


    }
}
