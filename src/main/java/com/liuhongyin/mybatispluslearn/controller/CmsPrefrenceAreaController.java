package com.liuhongyin.mybatispluslearn.controller;


import com.liuhongyin.mybatispluslearn.common.api.CommonResult;
import com.liuhongyin.mybatispluslearn.model.CmsPrefrenceArea;
import com.liuhongyin.mybatispluslearn.service.ICmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 优选专区 前端控制器
 * </p>
 *
 * @author liuhongyin
 * @since 2019-11-07
 */
@RestController
@RequestMapping("/cms-prefrence-area")
public class CmsPrefrenceAreaController {

    @Autowired
    private ICmsPrefrenceAreaService cmsPrefrenceAreaService;

    @GetMapping("/listAll")
    public CommonResult<List<CmsPrefrenceArea>> listAll() {
        List<CmsPrefrenceArea> cmsPrefrenceAreas = cmsPrefrenceAreaService.listAll();
        return CommonResult.success(cmsPrefrenceAreas);
    }

}
