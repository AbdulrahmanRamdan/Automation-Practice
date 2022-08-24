import org.openqa.selenium.WebDriver;

public class Pages {
    public WebDriver driver;
    public Pages(WebDriver driver){
        this.driver=driver;
    }
    public Search_Page get_Search_Page(){
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
        return new Search_Page(this.driver);
    }
    public Google_Search get_Google_Page(){
        driver.get("https://www.google.com/");
        return new Google_Search(driver);
    }
}
