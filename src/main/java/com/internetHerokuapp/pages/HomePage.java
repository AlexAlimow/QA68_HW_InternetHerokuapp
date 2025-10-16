package com.internetHerokuapp.pages;

import com.internetHerokuapp.core.BasePage;
import com.internetHerokuapp.pages.alertFrameWindows.WindowsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".heading")
    WebElement heading;

    public boolean isAtHomePage() {
        return heading.isDisplayed() && heading.getText().equals("Welcome to the-internet");
    }

    @FindBy(css = "a[href='/login']")
    WebElement loginLink;

    public LoginPage goToLoginPage() {
        click(loginLink);
        return new LoginPage(driver);
    }

    public String getHeadingText() {
        return heading.getText();
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javascriptAlerts;

    public HomePage selectAlertsFrameWindows() {
        click(javascriptAlerts);
        return this;
    }

    @FindBy(css = "#content > ul > li:nth-child(33) > a")
    WebElement windows;
    public WindowsPage OpenMultipleWindow() {
        click(windows);
        return new WindowsPage(driver);
    }
}
