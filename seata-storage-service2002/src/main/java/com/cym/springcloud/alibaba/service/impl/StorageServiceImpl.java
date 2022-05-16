package com.cym.springcloud.alibaba.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cym.springcloud.alibaba.domain.Storage;
import com.cym.springcloud.alibaba.service.StorageService;
import com.cym.springcloud.alibaba.mapper.StorageMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
* @author cym
* @description 针对表【t_storage(库存)】的数据库操作Service实现
* @createDate 2022-05-15 19:39:39
*/
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage>
    implements StorageService{
  @Resource
  private StorageMapper storageMapper;

  @Override
  public void decrease(Long productId, Integer count) {
    UpdateWrapper<Storage> wrapper = new UpdateWrapper<>();
    wrapper.eq("product_id",productId)
        .setSql( "used = used +" + count )
        .setSql( "residue = residue -" + count );
    storageMapper.update(null,wrapper);
  }
}




