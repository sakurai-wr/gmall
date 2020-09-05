package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author Sakurai.WR
 * @email huamenxingrui@gmail.com
 * @date 2020-09-05 16:01:21
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
