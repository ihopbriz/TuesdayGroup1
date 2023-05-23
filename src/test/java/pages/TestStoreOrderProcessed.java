package pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStoreOrderProcessed extends BasePage {
    public TestStoreOrderProcessed(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span.maintext")
    WebElement orderProcessedMessage;


    public void checkOrderProcessed() {
        assertEquals(orderProcessedMessage.getText(), "YOUR ORDER HAS BEEN PROCESSED!");
        System.out.println("Expected message: "+orderProcessedMessage.getText());


    }
}
