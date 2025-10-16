package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTests extends TestBase {

    @BeforeEach
    public void precondition() {
        verifyHomePage(); // убеждаемся, что открыта главная страница
    }

    @Test
    public void loginPositiveTest() {
        assertTrue(
                loginAsTomSmith()
                        .getFlashMessage()
                        .contains("You logged into a secure area!"),
                "Flash message should confirm successful login"
        );
    }
}
