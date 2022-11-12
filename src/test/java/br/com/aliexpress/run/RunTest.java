package br.com.aliexpress.run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        tags = {"@whip"},
        glue = "br/com/aliexpress/steps",
        plugin = { "pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        //plugin = {"json:target/cucumber.json", "pretty","html:target/cucumber-reports"},
        snippets = SnippetType.CAMELCASE
)
public class RunTest {
}
