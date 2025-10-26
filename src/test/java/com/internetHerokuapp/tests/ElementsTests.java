package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.elements.ImagesPage;
import com.internetHerokuapp.pages.elements.FileUploadPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementsTests extends TestBase {
    HomePage homePage;
    ImagesPage links;
    FileUploadPage upload;

    @BeforeEach
    public void precondition() {
        homePage = new HomePage(driver);
        links = new ImagesPage(driver);
        upload = new FileUploadPage(driver);

    }

    @Test
    public void brokenImagesTest(){
        homePage.selectImages();
        links.checkBrokenImages();
    }

    @Test
    public void uploadFileTest(){
        homePage.selectUpload();
        upload
                .uploadFile("C:/Tools/cat.jpg")
                .verifyFileUpLoaded("cat.jpg");
    }
}
