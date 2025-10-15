package com.internetHerokuapp.core;

import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.LoginPage;
import com.internetHerokuapp.pages.SecurePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;
    protected HomePage homePage;

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        homePage = new HomePage(driver);
    }

    protected void verifyHomePage() {
        if (!homePage.isAtHomePage()) {
            throw new IllegalStateException("We are not on HomePage!");
        }
    }

    protected LoginPage goToLoginPage() {
        return homePage.goToLoginPage();
    }

    protected SecurePage login(String username, String password) {
        return goToLoginPage().login(username, password);
    }
}