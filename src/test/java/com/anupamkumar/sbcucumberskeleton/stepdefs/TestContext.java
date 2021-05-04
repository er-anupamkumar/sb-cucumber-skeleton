package com.anupamkumar.sbcucumberskeleton.stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.spring.ScenarioScope;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Data
@Component
@ScenarioScope
public class TestContext {

  private Scenario scenario;
  private String scenarioName = "";
  private String testSuiteDataFilePath = "";
  private Map<String, Object> testDataMap;

  @Getter(value = AccessLevel.PRIVATE)
  @Setter(value = AccessLevel.PRIVATE)
  private Map<String, Object> sharedData;

  public void log(String message) {
    scenario.log(message);
  }

  public Object getTestData(String key) {
    return testDataMap.get(key);
  }

  public Object sharedTestData(String key) {
    return sharedData.get(key);
  }

  public void sharedTestDataPut(String key, Object value) {
    if (sharedData == null) {
      sharedData = new HashMap<>();
    }
    sharedData.put(key, value);
  }
}
