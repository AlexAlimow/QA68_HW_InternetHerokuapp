package com.globalSqa.pages.widgets;

import com.internetHerokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "iframe.demo-frame")
    WebElement sliderFrame;

    @FindBy(css = "#green .ui-slider-handle")
    WebElement sliderHandle;

    @FindBy(css = "#green input")
    WebElement sliderValueInput;

    public SliderPage moveSliderInHorizontalDirection(int xOffset) {
        driver.switchTo().frame(sliderFrame);
        scrollAndWaitOfElement(sliderHandle, 10, 0, 300);

        actions.clickAndHold(sliderHandle).moveByOffset(xOffset, 0).release().perform();
        return this;
    }

    @FindBy(css = "#swatch")
    WebElement swatch;


    public SliderPage verifySliderColor(String text) {
        Assertions.assertTrue(shouldHaveText(swatch, text, 5));
        return this;
    }
}



