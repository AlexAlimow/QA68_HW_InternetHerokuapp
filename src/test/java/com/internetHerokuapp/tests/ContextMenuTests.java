package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.ContextMenuPage;
import com.internetHerokuapp.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTests extends TestBase {
    ContextMenuPage context;

    @BeforeEach
    public void precondition() {
        context = new ContextMenuPage(driver);
        new HomePage(driver).contextMenuLink();
    }

    @Test
    public void contextMenuTest() {
        context.rightClickOnHotSpot();
        context.closeAlert();

    }
}
