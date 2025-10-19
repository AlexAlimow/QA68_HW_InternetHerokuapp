package com.internetHerokuapp.pages.alertFrameWindows;

import com.internetHerokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > ul > li:nth-child(1) > button")
    WebElement alerts;

    public AlertsPage clickForJsAlertButton() {
        click(alerts);
        return this;
    }

    public AlertsPage acceptAlert() {
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(xpath = "//*[@id='content']/div/ul/li[2]/button")

    WebElement jsConfirmButton;

    public AlertsPage clickForJsConfirmButton() {
        click(jsConfirmButton);
        return this;
    }

    public AlertsPage selectResult(String result) {
        if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Отмена")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement resultText;

    public AlertsPage verifyResult(String text) {
        Assertions.assertTrue(isContainsText(text, resultText));
        return this;
    }

    @FindBy(xpath = "//ul/li[3]/button")
    WebElement jsPromptButton;

    public AlertsPage clickForJsPromptButton() {
        click(jsPromptButton);
        return this;
    }

    public AlertsPage sendMessageToAlert(String text) {
        if (text != null) {
            driver.switchTo().alert().sendKeys(text);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement promptRes;

    public AlertsPage verifyMessage(String text) {
        Assertions.assertTrue(isContainsText(text, promptRes));
        return this;
    }
}
