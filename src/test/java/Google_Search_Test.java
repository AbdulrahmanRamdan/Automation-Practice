import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google_Search_Test extends Base_Test{
    Google_Search google_search;
    @BeforeTest
    void set_Google_page(){
        google_search=pages.get_Google_Page();
    }
    @Test(priority = 1)
    void validate_Google_Logo(){
        Assert.assertTrue(google_search.find_Google_Logo());
    }
    @Test(priority = 2)
    void validate_Article_Result(){
        google_search.set_Search_Text("Test automation");
        google_search.click_Search_Button();
        Assert.assertTrue(google_search.find_Result_Article());
    }
}
