
package com.liuhongyin.mybatispluslearn.service.impl;

import com.liuhongyin.mybatispluslearn.mapper.CmsPrefrenceAreaMapper;
import com.liuhongyin.mybatispluslearn.model.CmsPrefrenceArea;
import com.liuhongyin.mybatispluslearn.service.ICmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* <p>
* 优选专区 服务实现类
* </p>
*
* @author liuhongyin
* @since 2019-11-07
*/
@Service
public class CmsPrefrenceAreaServiceImpl implements ICmsPrefrenceAreaService {

    @Autowired
    private CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;
    @Override
    public List<CmsPrefrenceArea> listAll() {
        return cmsPrefrenceAreaMapper.selectList(null);
    }
}
