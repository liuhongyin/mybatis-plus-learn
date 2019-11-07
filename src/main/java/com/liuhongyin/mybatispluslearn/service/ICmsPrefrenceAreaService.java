package com.liuhongyin.mybatispluslearn.service;

import com.liuhongyin.mybatispluslearn.model.CmsPrefrenceArea;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* <p>
* 优选专区 服务类
* </p>
*
* @author liuhongyin
* @since 2019-11-07
*/
public interface ICmsPrefrenceAreaService {

    List<CmsPrefrenceArea> listAll();

}