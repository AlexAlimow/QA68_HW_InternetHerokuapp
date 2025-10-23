package com.internetHerokuapp.pages;

import com.internetHerokuapp.core.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpot;

    public ContextMenuPage rightClickOnHotSpot() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "var evt = new MouseEvent('contextmenu', {bubbles: true, cancelable: true});" +
                        "arguments[0].dispatchEvent(evt);",
                hotSpot
        );
        return this;
    }

    public ContextMenuPage closeAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        return this;
    }
}
