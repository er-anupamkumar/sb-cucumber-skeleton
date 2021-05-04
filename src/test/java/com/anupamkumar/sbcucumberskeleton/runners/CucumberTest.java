package com.anupamkumar.sbcucumberskeleton.runners;

import io.cucumber.testng.CucumberOptions;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CucumberOptions(
    glue = {"com.anupamkumar.sbcucumberskeleton"},
    plugin = {"json:target/cucumber-report/cucumber.json", "pretty"},
    features = {"src/test/resources/features"})
public class CucumberTest extends AbstractCucumberParallelTests {}
