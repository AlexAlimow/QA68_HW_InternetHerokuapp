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

    @FindBy(css = ".row.price_table_holder>div:nth-child(3) li:nth-child(6)")
    WebElement dragAndDrop;

    public DroppablePage clickOnDragAndDropLink() {
        //scrollAndWaitOfElement(dragAndDrop, 10, 0, 400);
        click(dragAndDrop);
        return new DroppablePage(driver);
    }
}
