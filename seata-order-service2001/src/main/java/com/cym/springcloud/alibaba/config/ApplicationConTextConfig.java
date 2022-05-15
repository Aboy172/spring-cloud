package com.cym.springcloud.alibaba.config;

import com.alibaba.druid.pool.DruidDataSource;
import feign.Logger;
import feign.Logger.Level;
import io.seata.rm.datasource.DataSourceProxy;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author cym
 * @date 2022-05-15  17:34
 * @description 配置类
 */
@Configuration
public class ApplicationConTextConfig {

  @Bean
  Logger.Level feignLoggerLevel() {
    return Level.FULL;
  }

  @Value("${spring.datasource.driver-class-name}")
  private String driverClassName;

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

  @Bean
  public DataSource getDataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driverClassName);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    return dataSource;
  }

  /**
   * 优先注入代理数据源，然后再设置数据源的具体信息，也就是上面
   * @param dataSource 数据源
   * @return 返回数据源代理对象
   */
  @Primary
  @Bean
  public DataSourceProxy dataSource(DataSource dataSource) {
    return new DataSourceProxy(dataSource);
  }


}
