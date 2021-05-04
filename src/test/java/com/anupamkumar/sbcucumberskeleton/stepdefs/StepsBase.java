package com.anupamkumar.sbcucumberskeleton.stepdefs;

import com.anupamkumar.sbcucumberskeleton.EnvironmentConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import groovy.util.logging.Slf4j;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class StepsBase {
  @Autowired
  TestContext testContext;
  @Autowired
  EnvironmentConfig environmentConfig;
  @Autowired ObjectMapper mapper;

  void verifyTheHttpStatusCode(Response response, int arg0) {
    assertThat(response.statusCode()).isEqualTo(arg0);
  }

  void verifyErrorCodeInResponse(Response response, String arg0) {
    assertThat(response.jsonPath().get("errorCode").toString()).isEqualTo(arg0);
  }

  void verifyTheMessageInResponse(Response response, String arg0) {
    assertThat(response.jsonPath().get("message").toString()).isEqualTo(arg0);
  }
}
