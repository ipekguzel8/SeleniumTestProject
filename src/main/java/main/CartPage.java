package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    By productLocator= By.cssSelector("rd-cart-item shoppingcart-item");
    By productPriceCart= By.cssSelector("span.rd-cart-item-price mb-15");
    public boolean isPrice(){
        return productPrice==text(productPriceCart);
    }
    public boolean checkIfProductAdded() {
        return getProducts().size()>0;
    }
    public List<WebElement> getProducts(){
        return findAll(productLocator);
    }
}
