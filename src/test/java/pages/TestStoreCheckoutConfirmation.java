package pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TestStoreCheckoutConfirmation extends BasePage {
    public TestStoreCheckoutConfirmation(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "checkout_btn")
    WebElement confirmOrderButton;


    public void confirmOrder() {
        confirmOrderButton.click();

    }

}
