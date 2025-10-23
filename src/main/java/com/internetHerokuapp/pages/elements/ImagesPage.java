package com.internetHerokuapp.pages.elements;

import com.internetHerokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagesPage extends BasePage {

    public ImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > img")
    List<WebElement> images;

    public ImagesPage checkBrokenImages() {
        System.out.println("Total images on the page: " + images.size());

        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            verifyLinks(imageUrl);

            try {
                boolean imageDisplayed = (Boolean) js.executeScript(
                        "return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0)",
                        image
                );

                if (imageDisplayed) {
                    softly.assertThat(imageDisplayed).as("Image displayed: " + imageUrl).isTrue();
                } else {
                    softly.fail("Broken image: " + imageUrl);
                }

            } catch (Exception e) {
                softly.fail("Exception while checking image: " + imageUrl + " | " + e.getMessage());
            }
        }

        softly.assertAll();

        return this;
    }

}
