package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.elements.ImagesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementsTests extends TestBase {
    HomePage homePage;
    ImagesPage links;

    @BeforeEach
    public void precondition() {
        homePage = new HomePage(driver);
        links = new ImagesPage(driver);
        homePage.selectImages();
    }


    @Test
    public void brokenImagesTest(){
        links.checkBrokenImages();
    }
}
