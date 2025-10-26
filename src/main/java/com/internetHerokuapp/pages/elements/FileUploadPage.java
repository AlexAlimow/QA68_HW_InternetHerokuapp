package com.internetHerokuapp.pages.elements;

import com.internetHerokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement uploadInput;

    @FindBy(id = "file-submit")
    WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;

    public FileUploadPage uploadFile(String filePath) {
        logger.info("Start to upload file: {}", filePath);
        uploadInput.sendKeys(filePath);
        uploadButton.click();
        logger.info("Clicked the 'Upload' button");
        return this;
    }

    public FileUploadPage verifyFileUpLoaded(String file) {
        logger.info("Verifying that file '{}' has been uploaded successfully",file);
        String actualFileName = uploadedFiles.getText();
        logger.debug("Actual uploaded file name: {}", actualFileName);
        Assertions.assertEquals(file,actualFileName,String.format("Expected file name '%s', but got '%s'", file, actualFileName));
        logger.info("File '{}' uploaded and verified successfully", file);
        return this;

    }
}
