package com.liuhongyin.mybatispluslearn.mapper;

import com.liuhongyin.mybatispluslearn.model.PmsProductCategoryAttributeRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* <p>
* 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） Mapper 接口
* </p>
*
* @author liuhongyin
* @since 2019-11-07
*/
@Repository
public interface PmsProductCategoryAttributeRelationMapper extends BaseMapper<PmsProductCategoryAttributeRelation> {}