package com.cym.springcloud.controller;

import com.cym.springcloud.servcie.MessageProvider;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cym
 * @date 2022-05-12  01:08
 * @description
 */
@RestController
public class SendMessageController {

  @Resource
  private MessageProvider messageProvider;

  @GetMapping("/sendMessage")
  public String sendMessage(){
    return messageProvider.send();
  }

}
