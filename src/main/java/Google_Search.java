import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Search extends Element_Object{
    WebDriver driver;
    WebElement search_Button;
    WebElement search_Input;
    WebElement article_Result;
    WebElement google_Logo;
    By search_Input_Path=By.xpath("//input[@title=\"بحث\"]");
    By search_Button_Path=By.xpath("//input[@class=\"gNO89b\"]");
    By google_Logo_Path=By.className("lnXdpd");
    By article_Result_Path=By.xpath("//span[contains(text(),\"What is test automation?\")]");
    public Google_Search(WebDriver webDriver){
        this.driver=webDriver;
    }
    public void set_Search_Text(String text){
        search_Input=driver.findElement(search_Input_Path);
        clear(search_Input);
        sendKey(search_Input,text);
    }
    public void back(){
        driver.navigate().back();
    }
    public void click_Enter_Key(){
        driver.findElement(search_Input_Path).sendKeys(Keys.ENTER);
    }
    public void click_Search_Button(){
        search_Button=driver.findElement(search_Button_Path);
        click(search_Button);
    }
    public boolean find_Google_Logo(){
         google_Logo=driver.findElement(google_Logo_Path);
         return google_Logo.isDisplayed();
    }
    public boolean find_Result_Article(){
        article_Result=driver.findElement(article_Result_Path);
        return article_Result.isDisplayed();
    }


}
