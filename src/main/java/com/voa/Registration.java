package com.voa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.sql.Driver;

public class Registration {

    private WebDriver driver;
    private String url="https://www.gov.uk/correct-your-business-rates";

    @FindBy(css = "gem-c-button govuk-button govuk-button--start")
    WebElement startnow;

    public Registration(Driver driver) throws IOException {

        WebDriver sdriver = driver.start();
        this.driver=sdriver;
        PageFactory.initElements(sdriver, this);
        sdriver.get(url);

    }

    public void startnow() {

        startnow.click();
    }
}