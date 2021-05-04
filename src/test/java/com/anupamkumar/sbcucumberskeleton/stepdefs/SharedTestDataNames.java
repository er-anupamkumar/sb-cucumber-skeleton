package com.anupamkumar.sbcucumberskeleton.stepdefs;

public enum SharedTestDataNames {

  USERNAME("username"),
  PASSWORD("password");
  private String name;

  SharedTestDataNames(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
