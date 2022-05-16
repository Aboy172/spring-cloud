package com.cym.springcloud.servcie.impl;

import com.cym.springcloud.servcie.MessageProvider;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author cym
 * @date 2022-05-12  00:54
 * @description
 */
@Service
@Slf4j
@AllArgsConstructor
public class MessageProviderImpl implements MessageProvider {

  private final StreamBridge streamBridge;


  @Override
  public String send() {
    String serial = UUID.randomUUID().toString();
    String bingDingName = "myChannel-out-0";
    streamBridge.send(bingDingName, MessageBuilder.withPayload(serial).build());
    System.out.println("通道:" + bingDingName + "****发送的信息是" + serial);
    return null;
  }
}
