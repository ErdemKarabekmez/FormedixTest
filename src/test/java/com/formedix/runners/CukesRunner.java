package com.formedix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "com/formedix/stepDefinitions",
        dryRun = true,
        tags = "@wip"



)
public class CukesRunner {
}
