package com.utest.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utest.feature",
        glue = "com.utest.automation.stepdefinitions",
        plugin = "rerun:target/runFailed/TestRerun.txt",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Utest {
}
