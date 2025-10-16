package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.alertFrameWindows.AlertsPage;
import com.internetHerokuapp.pages.alertFrameWindows.WindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlertFrameWindowsTests extends TestBase {

    HomePage homePage;
    AlertsPage alerts;
    WindowsPage windows;


    @BeforeEach
    public void precondition() {
        homePage = new HomePage(driver);
        alerts = new AlertsPage(driver);
        windows = new WindowsPage(driver);
    }

    @Test
    public void clickForJsAlertTest() {
        homePage.selectAlertsFrameWindows();
        alerts.clickForJsAlertButton()
                .acceptAlert();
    }

    @Test
    @DisplayName("Verify to -> 'Cancel' is displayed")
    public void clickForJsConfirmTest() {
        homePage.selectAlertsFrameWindows();
        alerts.clickForJsConfirmButton()
                .selectResult("OK")
                .verifyResult("You clicked: Ok");
    }

    @Test
    @DisplayName("Verify to -> 'Text you entered' is displayed")
    public void clickForJsPromptTest() {
        homePage.selectAlertsFrameWindows();
        alerts.clickForJsPromptButton()
                .sendMessageToAlert("Hello World")
                .verifyMessage("Hello World");
    }
// [href='/windows/new']
    @Test
    public void switchToNewTabTest() {
        homePage.OpenMultipleWindow();
        windows.clickOnNewWindowButton()
                .switchToNewTab(1)
                .verifyNewTabTitle("New Window");


    }


}
