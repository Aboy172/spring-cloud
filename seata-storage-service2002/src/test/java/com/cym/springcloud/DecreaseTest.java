package com.cym.springcloud;

import com.cym.springcloud.alibaba.service.StorageService;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author cym
 * @date 2022-05-15  19:55
 * @description
 */
@SpringBootTest
public class DecreaseTest {
  @Resource
  private StorageService storageService;
  @Test
  public void test(){
    storageService.decrease(1L,1);
  }
}
