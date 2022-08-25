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
    public Google_Search(WebDriver webDriver){
        this.driver=webDriver;
    }
    public void set_Search_Text(String text){
        search_Input=driver.findElement(By.xpath("//input[@title=\"بحث\"]"));
        clear(search_Input);
        sendKey(search_Input,text);
    }
    public void back(){
        driver.navigate().back();
    }
    public void click_Enter_Key(){
        driver.findElement(By.xpath("//input[@title=\"بحث\"]")).sendKeys(Keys.ENTER);
    }
    public void click_Search_Button(){
        search_Button=driver.findElement(By.xpath("//input[@class=\"gNO89b\"]"));
        click(search_Button);
    }
    public boolean find_Google_Logo(){
         google_Logo=driver.findElement(By.className("lnXdpd"));
         return google_Logo.isDisplayed();
    }
    public boolean find_Result_Article(){
        article_Result=driver.findElement(By.xpath("//span[contains(text(),\"What is test automation?\")]"));
        return article_Result.isDisplayed();
    }


}
