package com.cym.springcloud.alibaba.mapper;

import com.cym.springcloud.alibaba.domain.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author cym
* @description 针对表【t_storage(库存)】的数据库操作Mapper
* @createDate 2022-05-15 19:39:39
* @Entity com.cym.springcloud.alibaba.domain.Storage
*/
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

}




