package ru.etp.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SubscriptionPage extends BasePage {

    public SubscriptionPage(WebDriver driver) {
        super(driver);
    }

    //Add new exchange
    @FindBy(css = ".sc-fzXfPg")
    private WebElement userButton;

    @FindBy(linkText = "Subscription")
    private WebElement subButton;

    @FindBy(css = ".guaEXt")
    private WebElement addButton;

    @FindBy(css = ".cAXUcw .sc-fzXfPf")
    private WebElement help;

    @FindBy(css = ".ffAAVg")
    private WebElement selectProtocolButton;

    @FindBy(xpath = "//*[@id=\"ETPGems\"]/div[3]/div[2]/div[2]/div/div[4]/div/div[2]/div[3]/div[1]")
    private WebElement selectProtocol;

    @FindBy(css = ".WefCk")
    private WebElement numberOfSessions;

    @FindBy(css = ".dxdSCX")
    private WebElement add;

    @FindBy(css = ".hSNJdz")
    private WebElement check;

    public String expectedTitle() {
        String expected = driver.getTitle();
        return expected;
    }

    // edit existing exchange

    @FindBy(xpath = "//div[@name='sc-LzLwq'][3]")
    private WebElement changeNumberOfSessions;

    // select existing exchange
    @FindBy(xpath = "//div[@name='sc-LzLrm'][1]")
    private WebElement selectExchange;

    // delete existing exchange
    @FindBy(className = "sc-LzLsz ensAMi")
    private WebElement deleteExchange;


    public void pressUserButton() {
        wait.until(ExpectedConditions.elementToBeClickable(userButton));
        userButton.click();
    }

    public void pressSubscriptionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(subButton));
        subButton.click();
    }


    public void pressHelpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(help));
        help.click();
    }


    public SubscriptionPage addNewExchange() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(addButton));
        addButton.click();
        wait.until(ExpectedConditions.visibilityOf(numberOfSessions));
        numberOfSessions.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(selectProtocolButton));
        selectProtocolButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(selectProtocol));
        selectProtocol.click();
        add.click();
        return this;
    }

    public void editExistingExchange() {
        wait.until(ExpectedConditions.elementToBeClickable(selectExchange));
        selectExchange.click();
    }

    public void deleteExistingExchange() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteExchange));
        deleteExchange.click();
    }
}

