package TestCases;
import main.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AddProductToCartTest extends BaseTest{
    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void loginUser(){
        homePage= new HomePage(driver);
        String actualURL = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.lcwaikiki.com/tr-TR/TR",actualURL,"Not on Home Page!");
        homePage.loginForm_().login();

    }
    @Test
    @Order(2)
    public void searchProduct(){
        SearchBox searchBox = homePage.searchBox();
        searchBox.search("pantolan");
        productPage= new ProductPage(driver);
    }

    @Test
    @Order(3)
    public void selectProduct(){
        productDetailPage= new ProductDetailPage(driver);
        productPage.selectProduct(1);
    }

    @Test
    @Order(4)
    public void addProductToCart(){
        productDetailPage.addToCart();
    }
    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
    }
}
