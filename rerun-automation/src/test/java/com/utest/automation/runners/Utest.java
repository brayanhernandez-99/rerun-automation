package com.utest.automation.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utest.feature",
        glue = "com.utest.automation.stepdefinitions",
        plugin = "rerun:target/test/failed/testFailed.txt",
        snippets = CAMELCASE
)

public class Utest {
}
