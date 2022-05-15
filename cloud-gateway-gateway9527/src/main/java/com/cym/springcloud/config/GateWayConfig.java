package com.cym.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cym
 * @date 2022-05-10  16:00
 * @description gateway配置类
 */
@Configuration
public class GateWayConfig {

  @Bean
  public RouteLocator routes(RouteLocatorBuilder builder) {
    Builder route = builder.routes();
    route.route("path_route_cym", r -> r.path("/explore")
            .uri("https://gitee.com/explore")).build();
    return route.build();
  }

  //@Bean
  //public RouteLocator routes2(RouteLocatorBuilder builder) {
  //  Builder route = builder.routes();
  //  route.route("path_route_cym2", r -> r.path("/")
  //      .uri("http://www.baidu.com/")).build();
  //  return route.build();
  //}

}
