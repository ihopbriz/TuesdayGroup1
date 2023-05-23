package pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestStoreHomePage extends BasePage {
    public TestStoreHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#block_frame_featured_1769 > div > div:nth-child(1) > div.thumbnail > div.pricetag.jumbotron > a > i")
    WebElement firstAddtoCart;
    @FindBy(css = "#main_menu_top > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)")
    WebElement checkoutButton;
    @FindBy(id = "filter_keyword")
    WebElement searchBox;
    @FindBy(css = "#search_form > div > div > i")
    WebElement magnifyingGlass;
    @FindBy(css = "html body.product-product div.container-fixed header div.headerstrip.navbar.navbar-inverse div.container-fluid div.navbar-collapse.collapse div.navbar-right.headerstrip_blocks div.block_3 div#topnav.topnavbar.navbar ul#main_menu_top.nav.navbar-nav.main_menu li.dropdown a.top.menu_specials")
    WebElement specialsLink;








    public void clickAddtoCart() {
        firstAddtoCart.click();
    }

    public void clickcheckout() {
        checkoutButton.click();
    }

    public void enterSearchItem(String searchString) {
        searchBox.sendKeys(searchString);
        magnifyingGlass.click();
    }


}
