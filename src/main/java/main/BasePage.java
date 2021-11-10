package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    String baseUrl="https://www.lcwaikiki.com/tr-TR/TR";
    public int productPrice;
    public BasePage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }
    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
    public int text(By locator){
        String text = find(locator).getText();
        return Integer.parseInt(text);
    }
}
