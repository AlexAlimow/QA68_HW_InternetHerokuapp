package com.internetHerokuapp.pages.dropdown;

import com.internetHerokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    private WebElement dropdown;

    public DropdownPage selectByVisibleText(String text) {
        new Select(dropdown).selectByVisibleText(text);
        logger.info("Selected option:" + text);
        return this;
    }

    public DropdownPage verifySelectedOption(String expected) {
        String selectedOption = new Select(dropdown).getFirstSelectedOption().getText();
        Assertions.assertTrue(shouldHaveText(dropdown, selectedOption, 5));
        logger.info("Verified selected option: " + expected);
        return this;
    }
}
