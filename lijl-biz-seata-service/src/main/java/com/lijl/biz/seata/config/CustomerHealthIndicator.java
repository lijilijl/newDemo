package com.lijl.biz.seata.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

public class CustomerHealthIndicator implements HealthIndicator {
  @Override
  public Health health() {
    return Health.down().build();
  }
}
