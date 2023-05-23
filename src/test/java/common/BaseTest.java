package common;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://automationteststore.com/");
    }

    @AfterEach
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void tearDown(){
//        driver.close();
    }
}
