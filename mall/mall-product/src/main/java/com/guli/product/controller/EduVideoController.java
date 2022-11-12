package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.product.entity.EduVideoEntity;
import com.guli.product.service.EduVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 课程视频
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@RestController
@RequestMapping("product/eduvideo")
public class EduVideoController {
    @Autowired
    private EduVideoService eduVideoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduVideoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduVideoEntity eduVideo = eduVideoService.getById(id);

        return R.ok().put("eduVideo", eduVideo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduVideoEntity eduVideo){
		eduVideoService.save(eduVideo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduVideoEntity eduVideo){
		eduVideoService.updateById(eduVideo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduVideoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
