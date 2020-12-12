package com.lijl.biz.seata.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customEndpoint")
public class CustomerEndpoint {
  @ReadOperation
  public String see(){
    return "hello word!!!";
  }
}
