package com.anupamkumar.sbcucumberskeleton.stepdefs;

import com.anupamkumar.sbcucumberskeleton.TestConfig;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TestConfig.class)
public class CommonSteps {
  @Autowired TestContext testContext;

  @Value("${spring.profiles.active}")
  private String executionEnvironment;

  @Before
  public void before(Scenario scenario) {
    testContext.setScenario(scenario);
    testContext.setScenarioName(scenario.getName());
    scenario.log("Scenario Name =" + testContext.getScenarioName());
    scenario.log("executionEnvironment Name =" + executionEnvironment);
  }

  @Then("wait for {int} seconds")
  public void waitForSeconds(int arg0) throws InterruptedException {
    testContext.log("Pausing execution for " + arg0 + " seconds.....");
    Thread.sleep(arg0 * 1000);
  }
}
