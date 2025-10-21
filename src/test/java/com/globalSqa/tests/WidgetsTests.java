package com.globalSqa.tests;

import com.globalSqa.core.TestBaseGlobalSQA;
import com.globalSqa.pages.MainPage;
import com.globalSqa.pages.widgets.SliderPage;
import com.internetHerokuapp.pages.dropdown.DropdownPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WidgetsTests extends TestBaseGlobalSQA {
    MainPage mainPage;


    @BeforeEach
    public void precondition() {
        mainPage.clickOnSlidersLink();


    }

    @Test
    public void sliderTest() {
        new SliderPage(driver)
                .moveSliderInHorizontalDirection(150)
                .verifySliderColor("rgb(255, 253, 60)"); // Никак не могу локатор для проверки
    }

}
