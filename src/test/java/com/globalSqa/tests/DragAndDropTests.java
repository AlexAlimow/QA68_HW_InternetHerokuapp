package com.globalSqa.tests;

import com.globalSqa.core.TestBaseGlobalSQA;
import com.globalSqa.pages.MainPage;
import com.globalSqa.pages.interactions.DroppablePage;
import com.internetHerokuapp.pages.dropdown.DropdownPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DragAndDropTests extends TestBaseGlobalSQA {
    MainPage mainPage;
    DroppablePage droppable;

    @BeforeEach
    public void precondition() {
        mainPage = new MainPage(driver);
        droppable = new DroppablePage(driver);
        mainPage.clickConfirm();
        droppable.clickOnDragAndDropLink();


    }

    @Test
    public void dragAndDropTest(){
    droppable.clickOnPropagation();

    }
}
