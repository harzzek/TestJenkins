package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = "org.example",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class exampleTest {
}
