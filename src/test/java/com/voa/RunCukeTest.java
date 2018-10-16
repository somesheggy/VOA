package com.voa;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.cucumber.pro.JsonReporter:all"},monochrome = true,
        features = {"src/test/resources/feature"},
        snippets = SnippetType.CAMELCASE, tags = {""},
        glue = {""}
)

public class RunCukeTest {

}
