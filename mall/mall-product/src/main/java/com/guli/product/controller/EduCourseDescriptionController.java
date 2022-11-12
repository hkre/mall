package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.product.entity.EduCourseDescriptionEntity;
import com.guli.product.service.EduCourseDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 课程简介
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@RestController
@RequestMapping("product/educoursedescription")
public class EduCourseDescriptionController {
    @Autowired
    private EduCourseDescriptionService eduCourseDescriptionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduCourseDescriptionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduCourseDescriptionEntity eduCourseDescription = eduCourseDescriptionService.getById(id);

        return R.ok().put("eduCourseDescription", eduCourseDescription);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduCourseDescriptionEntity eduCourseDescription){
		eduCourseDescriptionService.save(eduCourseDescription);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduCourseDescriptionEntity eduCourseDescription){
		eduCourseDescriptionService.updateById(eduCourseDescription);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduCourseDescriptionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
