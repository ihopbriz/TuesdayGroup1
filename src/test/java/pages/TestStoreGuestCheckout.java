package pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestStoreGuestCheckout extends BasePage {
    public TestStoreGuestCheckout(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "accountFrm_accountguest")
    WebElement guestCheckOutRadioButton;

    @FindBy(css = "button.btn:nth-child(4)")
    WebElement guestCheckOutContinueButton;






    public void clickGuestRadioButton() {
        guestCheckOutRadioButton.click();
    }

    public void clickGuestCheckOutContinueButton() {
        guestCheckOutContinueButton.click();
    }



}
