package ru.etp.qa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import ru.etp.qa.pages.LoginPage;
import ru.etp.qa.pages.SubscriptionPage;

public  class BaseTest {
    protected static final String BASE_URL = "https://spa-dev.etpmarkets.com:3000/auth/sign-in";
    protected static final String MAIL_LOGIN = "test.qa.1@esprow.com";
    protected static final String MAIL_PASSWORD = "temporaryAccount";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected SubscriptionPage subscriptionPage;



    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        subscriptionPage = new SubscriptionPage(driver);
        driver.get(BASE_URL);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
