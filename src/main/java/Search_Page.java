import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Search_Page extends Element_Object{
    private WebDriver driver;
    WebElement input_Text;
    WebElement search_Button;
    WebElement empty_Message_Error;
    WebElement noResult_Message_Error;
    List<WebElement> results_Elments;
    By input_Text_Path=By.id("search-input");
    By search_Button_Path=By.id("search-button");
    By empty_Message_Error_Path=By.id("error-empty-query");
    By noResult_Message_Error_Path=By.id("error-no-results");
    By results_Elments_Path=By.xpath("//Ul/Li");
    public Search_Page(WebDriver webdriver){
        this.driver=webdriver;}

    public void click_Search(){
        search_Button=driver.findElement(search_Button_Path);
        click(search_Button);
    }
    public void clear_Search_Text(){
        input_Text=driver.findElement(input_Text_Path);
        clear(input_Text);
    }
    public void set_Search_Text(String text){
        input_Text=driver.findElement(input_Text_Path);
        clear(input_Text);
        sendKey(input_Text,text);
    }
    public String get_NoResult_Message(){
        noResult_Message_Error=driver.findElement(noResult_Message_Error_Path);
        return get_Text(noResult_Message_Error);
    }
    public String get_Empty_Message(){
        empty_Message_Error=driver.findElement(empty_Message_Error_Path);
        return get_Text(empty_Message_Error);
    }
    public List<String>get_Text_Results(){
        results_Elments=driver.findElements(results_Elments_Path);
        List<String>text_Results=new ArrayList<>();
        for(int i=0;i<results_Elments.size();i++){
            text_Results.add(get_Text(results_Elments.get(i)));
            System.out.println(text_Results);
        }
        return text_Results;
    }

}
