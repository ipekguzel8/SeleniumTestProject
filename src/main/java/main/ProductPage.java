package main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    By seeMoreLocator= By.className("lazy-load-button");
    By productLocator=By.className("a_model_item");

    public void selectProduct(int i) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        seeMore();
        getAllProducts().get(i).click();
    }
    public void seeMore(){
        click(seeMoreLocator);
    }
    public List<WebElement> getAllProducts(){
        return findAll(productLocator);
    }

}
