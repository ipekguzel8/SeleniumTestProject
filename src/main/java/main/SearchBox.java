package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{
    public SearchBox(WebDriver driver) {
        super(driver);
    }
    By searchLocator=   By.cssSelector ("input#search_input");
    By submitLocator= new By.ByCssSelector("div.box2 button.searchButton");
    public void search(String text) {

        click(searchLocator);
        type(searchLocator,text);
        click(submitLocator);
    }
}
