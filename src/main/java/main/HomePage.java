package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    private SearchBox searchBox;
    private LoginForm loginForm;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox= new SearchBox(driver);
        loginForm=new LoginForm(driver);
    }
    By cartLocation =By.cssSelector("a.header-cart");
    public SearchBox searchBox() {
        return this.searchBox;
    }
    public LoginForm loginForm_() {
        return this.loginForm;
    }


    public void goToCart() {
        click(cartLocation);

    }
}
