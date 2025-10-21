package com.globalSqa.pages;

import com.globalSqa.pages.interactions.DroppablePage;
import com.globalSqa.pages.widgets.SliderPage;
import com.internetHerokuapp.core.BasePage;
import com.internetHerokuapp.pages.dropdown.DropdownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='https://www.globalsqa.com/demo-site/sliders/']")
    WebElement sliders;

    @FindBy(css = "button.fc-button.fc-cta-consent.fc-primary-button")
    WebElement fcButton;

    public SliderPage clickOnSlidersLink() {
        click(fcButton);
        click(sliders);
        return new SliderPage(driver);

    }
    public DropdownPage clickConfirm() {
        click(fcButton);
        return new DropdownPage(driver);
    }




}
