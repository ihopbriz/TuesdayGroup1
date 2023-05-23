package tests;

import common.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class BuyProductJUnitTest extends BaseTest {


    @Test
    public void firstItem() {
        //Home Page
        TestStoreHomePage testStoreHomePage = new TestStoreHomePage(driver);
        testStoreHomePage.clickAddtoCart();
        testStoreHomePage.clickcheckout();

        //Guest Checkout page
        TestStoreGuestCheckout testStoreGuestCheckout = new TestStoreGuestCheckout(driver);
        testStoreGuestCheckout.clickGuestRadioButton();
        testStoreGuestCheckout.clickGuestCheckOutContinueButton();

        //Guest Detail page
        TestStoreGuestCheckoutDetail testStoreGuestCheckoutDetail = new TestStoreGuestCheckoutDetail(driver);
        testStoreGuestCheckoutDetail.completeGuestDetails();

        //Order Confirmation
        TestStoreCheckoutConfirmation testStoreCheckoutConfirmation = new TestStoreCheckoutConfirmation(driver);
        testStoreCheckoutConfirmation.confirmOrder();

        //Order Processed Screen
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        TestStoreOrderProcessed testStoreOrderProcessed = new TestStoreOrderProcessed(driver);
        testStoreOrderProcessed.checkOrderProcessed();
    }


}
