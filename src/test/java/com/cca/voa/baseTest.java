package com.cca.voa;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {

        driver = new FirefoxDriver();
        driver.get("https://www.qa.tax.service.gov.uk/business-rates-dashboard/home");
        driver.manage().window().maximize();
    }

    public static void stop(){
        driver.quit();
    }
}
