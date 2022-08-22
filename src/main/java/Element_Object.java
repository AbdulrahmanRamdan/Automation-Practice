import org.openqa.selenium.WebElement;

public class Element_Object {
    public void click(WebElement webElement){
        webElement.click();
    }
    public void sendKey(WebElement webElement,String txt){
        clear(webElement);
        webElement.sendKeys(txt);
    }
    public void clear(WebElement webElement){
        webElement.clear();
    }
    public String get_Text(WebElement webElement){
        return webElement.getText();
    }
}
