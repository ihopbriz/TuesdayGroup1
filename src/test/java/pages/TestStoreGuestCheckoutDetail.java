package pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TestStoreGuestCheckoutDetail extends BasePage {
    public TestStoreGuestCheckoutDetail(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "guestFrm_firstname")
    WebElement firstName;
    @FindBy(id = "guestFrm_lastname")
    WebElement lastName;
    @FindBy(id = "guestFrm_email")
    WebElement email;
    @FindBy(id = "guestFrm_address_1")
    WebElement address1;
    @FindBy(id = "guestFrm_city")
    WebElement city;
    @FindBy(id = "guestFrm_zone_id")
    WebElement region;
//    @FindBy(css = "#guestFrm_zone_id > option:nth-child(11)")
//    WebElement region;

    @FindBy(id = "guestFrm_postcode")
    WebElement postcode;

//    @FindBy(id = "")
//    WebElement seperateAddressCheckbox;

    @FindBy(css = " #guestFrm > div.form-group > div > button")
    WebElement guestDetailContinue;








    public void completeGuestDetails() {
        firstName.sendKeys("Bob");
        lastName.sendKeys("Smith");
        email.sendKeys("bsmith@email.com");
        address1.sendKeys("1 New Road");
        city.sendKeys("Bristol");
        Select regionselect = new Select(region);
        regionselect.selectByVisibleText("Bristol");
        postcode.sendKeys("BS1 1SB");
        guestDetailContinue.click();

    }





}
