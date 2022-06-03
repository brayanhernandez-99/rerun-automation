package com.utest.automation.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "@target/TestFailed/TestFailed.txt",
        glue = "com.utest.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RerunFailedScenarios {
}
