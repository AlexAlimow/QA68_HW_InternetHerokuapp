package com.internetHerokuapp.tests;

import com.internetHerokuapp.core.TestBase;
import com.internetHerokuapp.pages.HomePage;
import com.internetHerokuapp.pages.dropdown.DropdownPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DropDownListsTests extends TestBase {
    HomePage homePage;
    DropdownPage dropdownPage;

    @BeforeEach
    public void precondition() {
        homePage = new HomePage(driver);
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void DropdownListTest() {
        homePage.clickOnDropdownLink();
        dropdownPage
                .selectByVisibleText("Option 1")
                .verifySelectedOption("Option 1")
                .selectByVisibleText("Option 2")
                .verifySelectedOption("Option 2");

    }

}
