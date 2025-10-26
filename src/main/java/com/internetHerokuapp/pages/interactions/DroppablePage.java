package com.internetHerokuapp.pages.interactions;

import com.internetHerokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public DroppablePage dragAndDrop() {
        waitOfElementVisibility(columnA,5);
        waitOfElementVisibility(columnB,5);
        actions.dragAndDrop(columnA,columnB).build().perform();
        logger.info("Drag and drop A element on B position");
        return this;

    }

    public DroppablePage verifyPosition() {
        waitOfElementVisibility(columnA,5);
        waitOfElementVisibility(columnB,5);
        boolean swaped = shouldHaveText(columnA,"B",5);
        Assertions.assertTrue(swaped);
        logger.info("SUCCESS: Element A on B position");
        return this;
    }
}
