import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Search_Test extends Base_Test{
    private Search_Page search_page;
    @BeforeTest
    void set_Search_Page(){
        search_page=pages.get_Search_Page();
    }
    @Test(priority = 1)
    void validate_Empty_Input(){
        search_page.clear_Search_Text();
        search_page.click_Search();
        Assert.assertEquals("Provide some query",search_page.get_Empty_Message());
    }
    @Test(priority = 2)
    void validate_NoResult_Input(){
        search_page.set_Search_Text("castle");
        search_page.click_Search();
        Assert.assertEquals("No results",search_page.get_NoResult_Message());
    }
    @Test(priority = 3)
    void validate_OneResult_Input(){
        search_page.set_Search_Text("Port Royal");
        search_page.click_Search();
        List<String>results=search_page.get_Text_Results();
        Assert.assertEquals("Port Royal",results.get(0));
    }
    @Test(priority = 4)
    void validate_ManyResult_Input(){
        search_page.set_Search_Text("isla");
        search_page.click_Search();
        List<String>results=search_page.get_Text_Results();
        Assert.assertTrue(results.size()>=1);
        for(int i=0;i<results.size();i++){
            Assert.assertTrue(results.get(i).toLowerCase().contains("isla"),"Not Contain");
        }
    }

}
