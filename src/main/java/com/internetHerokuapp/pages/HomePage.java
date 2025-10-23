package com.internetHerokuapp.pages;

import com.internetHerokuapp.core.BasePage;
import com.internetHerokuapp.pages.alertFrameWindows.FramesPage;
import com.internetHerokuapp.pages.alertFrameWindows.WindowsPage;
import com.internetHerokuapp.pages.dropdown.DropdownPage;
import com.internetHerokuapp.pages.elements.ImagesPage;
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

    @FindBy(css = "[href='/frames']")
    WebElement frames;

    public FramesPage selectFrames() {
        click(frames);
        return new FramesPage(driver);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement dropdownLink;

    public DropdownPage clickOnDropdownLink() {
        click(dropdownLink);
        return new DropdownPage(driver);
    }

    @FindBy(css = "a[href='/context_menu']")
    WebElement contextMenu;
    public ContextMenuPage contextMenuLink() {
        click(contextMenu);
        return new ContextMenuPage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImages;

    public ImagesPage selectImages() {
        click(brokenImages);
        return new ImagesPage(driver);
    }

}
