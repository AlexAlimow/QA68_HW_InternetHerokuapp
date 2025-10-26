package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.interactions.DroppablePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InteractionsTests extends TestBase {
    HomePage homePage;
    DroppablePage drop;


    @BeforeEach
    public void preconditions() {
        homePage = new HomePage(driver);
        drop = new DroppablePage(driver);
    }

    @Test
    public void dragAndDropTest() {
        homePage.selectDragAndDrop();
        drop.dragAndDrop()
                .verifyPosition();
    }

}
