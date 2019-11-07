package com.liuhongyin.mybatispluslearn.mapper;

import com.liuhongyin.mybatispluslearn.model.PmsProductLadder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* <p>
* 产品阶梯价格表(只针对同商品) Mapper 接口
* </p>
*
* @author liuhongyin
* @since 2019-11-07
*/
@Repository
public interface PmsProductLadderMapper extends BaseMapper<PmsProductLadder> {}