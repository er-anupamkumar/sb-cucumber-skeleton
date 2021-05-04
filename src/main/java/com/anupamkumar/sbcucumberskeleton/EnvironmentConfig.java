package com.anupamkumar.sbcucumberskeleton;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "environment")
@Data
public class EnvironmentConfig {

  private Map<String, String> props;

  public String getAttribute(String key) {
    return props.get(key);
  }
}
