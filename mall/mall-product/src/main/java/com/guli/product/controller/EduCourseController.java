package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduCourseEntity;
import com.guli.product.service.EduCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.guli.common.utils.R;
import java.util.Arrays;
import java.util.Map;




/**
 * 课程
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@RestController
@RequestMapping("product/educourse")
public class EduCourseController {
    @Autowired
    private EduCourseService eduCourseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduCourseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduCourseEntity eduCourse = eduCourseService.getById(id);

        return R.ok().put("eduCourse", eduCourse);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduCourseEntity eduCourse){
		eduCourseService.save(eduCourse);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduCourseEntity eduCourse){
		eduCourseService.updateById(eduCourse);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduCourseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
