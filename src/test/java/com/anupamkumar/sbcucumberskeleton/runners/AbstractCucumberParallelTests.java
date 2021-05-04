package com.anupamkumar.sbcucumberskeleton.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

public abstract class AbstractCucumberParallelTests extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider(parallel = false)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
