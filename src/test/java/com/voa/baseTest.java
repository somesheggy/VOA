package com.voa;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {

        driver = new FirefoxDriver();
        driver.get("https://www.gov.uk/correct-your-business-rates");
        driver.manage().window().maximize();
    }

    public static void stop(){
        driver.quit();
    }
}
