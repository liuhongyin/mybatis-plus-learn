package com.liuhongyin.mybatispluslearn.mapper;

import com.liuhongyin.mybatispluslearn.model.UmsAdminPermissionRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* <p>
* 后台用户和权限关系表(除角色中定义的权限以外的加减权限) Mapper 接口
* </p>
*
* @author liuhongyin
* @since 2019-11-07
*/
@Repository
public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {}