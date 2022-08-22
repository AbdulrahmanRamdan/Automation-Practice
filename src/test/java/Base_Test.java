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
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
        Assert.assertEquals(driver.getTitle(),"ARR");
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
