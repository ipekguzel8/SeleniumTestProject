package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm extends BasePage{
    public LoginForm(WebDriver driver) {
        super(driver);
    }
    By userLogin = By.cssSelector("div.dropdown a.dropdown-toggle");
    By email = By.id("LoginEmail");
    By password = By.id("Password");
    By loginBtn = By.id("loginLink");
    public void login() {
        click(userLogin);
        click(email);
        type(email,"ipekgzel8@gmail.com");
        type(password,"123456789.i");
        click(loginBtn);
    }
}
