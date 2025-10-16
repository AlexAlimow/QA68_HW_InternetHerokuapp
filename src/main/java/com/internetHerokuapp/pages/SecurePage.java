package com.internetHerokuapp.pages;

import com.internetHerokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends BasePage {

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "flash")
    private WebElement flashMessage;

    public String getFlashMessage() {
        return flashMessage.getText().trim();
    }
}
