package springcloud.service;

import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author cym
 * @date 2022-05-12  01:44
 * @description 接收消息
 */
@Service
@Slf4j
public class OutPutConsumerService {

  @Value("${server.port}")
  private String serverPort;

  @Bean
  public Consumer<String> myChannel(){
    return message -> log.info("接收到的消息是：" + message + "   serverPort" + serverPort);

  }

}
