@Sample
Feature: Sample Tests

  @ComponentTest @Smoke @Regression
  Scenario: Verify that the wait is working
    Given wait for 10 seconds

