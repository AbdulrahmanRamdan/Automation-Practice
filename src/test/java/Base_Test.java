import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Base_Test {
    private WebDriver driver;
    public Pages pages;
    @BeforeSuite
    void setup(){
        driver= WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        pages=new Pages(getDriver());
    }
    @AfterSuite
    void finish(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
