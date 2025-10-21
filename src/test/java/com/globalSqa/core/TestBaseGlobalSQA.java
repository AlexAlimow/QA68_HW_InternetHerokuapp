package com.globalSqa.core;

import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.LoginPage;
import com.internetHerokuapp.pages.SecurePage;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class TestBaseGlobalSQA {
    protected WebDriver driver;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


}

