package ru.etp.qa.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class GeneralTest extends BaseTest {

    @Test
    public void executeTest() throws InterruptedException {
        loginPage.inputLogin(MAIL_LOGIN);
        loginPage.inputPassword(MAIL_PASSWORD);
        loginPage.pressSubmitButton();
        subscriptionPage.pressUserButton();
        subscriptionPage.pressSubscriptionButton();
        assertEquals("Subscription", subscriptionPage.expectedTitle());
        subscriptionPage.pressHelpButton();
        subscriptionPage.addNewExchange();
        subscriptionPage.editExistingExchange();
        subscriptionPage.deleteExistingExchange();

    }
}

