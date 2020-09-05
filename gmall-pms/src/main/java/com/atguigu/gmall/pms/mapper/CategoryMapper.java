package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Sakurai.WR
 * @email huamenxingrui@gmail.com
 * @date 2020-09-05 11:54:44
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
