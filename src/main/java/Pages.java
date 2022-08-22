import org.openqa.selenium.WebDriver;

public class Pages {
    public WebDriver driver;
    public Pages(WebDriver driver){
        this.driver=driver;
    }
    public Search_Page get_Search_Page(){
        return new Search_Page(this.driver);
    }
}
