package com.globalSqa.pages.interactions;

import com.internetHerokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Propagation")
    WebElement propagation;

    public DroppablePage clickOnPropagation() {
        clickWithJS(propagation, 0, 200);
        return this;
    }

    @FindBy(css = "a[href='https://www.globalsqa.com/demo-site/draganddrop/']")
    WebElement dragAndDrop;

    public DroppablePage clickOnDragAndDropLink() {
        scrollAndWaitOfElement(dragAndDrop, 10, 0, 400);
        return new DroppablePage(driver);

    }
}
