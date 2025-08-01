package br.com.chronosacademy.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Passos :
// Runner - feature - steps - page - maps -> Sendo que é melhor fazer o maps primeiro para fazer a page

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        tags = "",
        glue = "src/test/java/br/com/chronosacademy/steps",
        plugin = {"json:target/reports/cucumberReports.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunnerTest {

}
