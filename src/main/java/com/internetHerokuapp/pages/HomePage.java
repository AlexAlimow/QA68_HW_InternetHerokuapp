package com.internetHerokuapp.pages;

import com.internetHerokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".heading")
    WebElement heading;

    @FindBy(css = "a[href='/login']")
    WebElement loginLink;


    public boolean isAtHomePage() {
        return heading.isDisplayed() && heading.getText().equals("Welcome to the-internet");
    }

    public LoginPage goToLoginPage() {
        click(loginLink);
        return new LoginPage(driver);
    }

    public String getHeadingText() {
        return heading.getText();
    }

}

