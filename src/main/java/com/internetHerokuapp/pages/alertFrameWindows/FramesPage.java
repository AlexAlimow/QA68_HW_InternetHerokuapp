package com.internetHerokuapp.pages.alertFrameWindows;

import com.internetHerokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/nested_frames']")
    WebElement nestedFrames;

    public FramesPage selectNestedFrames() {
        click(nestedFrames);
        logger.info("Nested Frames page opened");
        return this;
    }

    @FindBy(tagName = "body")
    WebElement body;

    public FramesPage handleNestedIframes() {

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        logger.info("Switched to the left frame");
        logger.info("Text in left frame: {}", body.getText());
        softly.assertThat(body.getText()).isEqualTo("LEFT");
        driver.switchTo().parentFrame();


        driver.switchTo().frame("frame-middle");
        logger.info("Switched to the middle frame");
        logger.info("Text in middle frame: {}", body.getText());
        softly.assertThat(body.getText()).isEqualTo("MIDDLE");
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        logger.info("Switched to the right frame");
        logger.info("Text in right frame: {}", body.getText());
        softly.assertThat(body.getText()).isEqualTo("RIGHT");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        logger.info("Switched to the bottom frame");
        logger.info("Text in bottom frame: {}", body.getText());
        softly.assertThat(body.getText()).isEqualTo("BOTTOM");
        driver.switchTo().defaultContent();

        logger.info("frames have been verified");
        softly.assertAll();
        return this;

    }
}
