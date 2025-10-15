package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.LoginPage;
import com.internetHerokuapp.pages.SecurePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTests extends TestBase {
    public LoginPage loginPage;

    @BeforeEach
    public void precondition() {
        init();
        verifyHomePage();
    }

    @Test
    public void loginPositiveTest() {
        SecurePage securePage = login("tomsmith", "SuperSecretPassword!");
        assertTrue(securePage.getFlashMessage().contains("You logged into a secure area!"));
    }
}