package com.cym.springcloud.servcie;

/**
 * @author cym
 * @date 2022-05-12  00:54
 * @description 消息业务类
 */
public interface MessageProvider {

  /**
   * 发送消息
   * @return null
   */
  String send();
}
