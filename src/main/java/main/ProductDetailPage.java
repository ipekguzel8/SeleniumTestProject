package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductDetailPage extends BasePage{
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    By addToCartLocator= By.id("pd_add_to_cart");
    By productSizeLocator= By.id("option-size");
    By productPriceLocator=By.className("div.basket-discount");
    public void addToCart() {
        click(productSizeLocator);
        //productPrice=text(productPriceLocator);
        click(addToCartLocator);


    }
}
