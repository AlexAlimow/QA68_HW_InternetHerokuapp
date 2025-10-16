package com.internetHerokuapp.pages.alertFrameWindows;

import com.internetHerokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement newWindow;

    public WindowsPage clickOnNewWindowButton() {
        click(newWindow);
        return this;
    }


    public WindowsPage switchToNewTab(int index) {
        switchToNewTabWindow(index);
        return this;
    }

    // div > h3

    @FindBy(css = "div > h3")
    WebElement textInNewWindow;

    public WindowsPage verifyNewTabTitle(String title) {
        Assertions.assertTrue(shouldHaveText(textInNewWindow, title,5));
        return this;
    }
}
