package com.voa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.IOException;

public class Driver {

    private ChromeDriverService service;
    private FirefoxDriver firefox;
    private WebDriver driver;

    public WebDriver start() throws IOException {

        System.setProperty("webdriver.firefox.marionette", "geckodriver");
        FirefoxOptions options = new FirefoxOptions()
                .setProfile(new FirefoxProfile());
        driver = new FirefoxDriver(options);
        return driver;

    }

    public void stop(){service.stop();
    }
}
