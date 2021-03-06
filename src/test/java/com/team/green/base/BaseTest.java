package com.team.green.base;

import com.team.green.constants.Constants.*;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.team.green.constants.Constants.*;

public class BaseTest {

    static WebDriver webDriver=null;

    @BeforeScenario
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "web_driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(WEBLINK);

    }
    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    @AfterScenario
    public void tearDown(){
        getWebDriver().quit();
    }

}
