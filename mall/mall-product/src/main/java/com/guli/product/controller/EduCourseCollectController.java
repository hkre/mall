package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.product.entity.EduCourseCollectEntity;
import com.guli.product.service.EduCourseCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 课程收藏
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@RestController
@RequestMapping("product/educoursecollect")
public class EduCourseCollectController {
    @Autowired
    private EduCourseCollectService eduCourseCollectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduCourseCollectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduCourseCollectEntity eduCourseCollect = eduCourseCollectService.getById(id);

        return R.ok().put("eduCourseCollect", eduCourseCollect);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduCourseCollectEntity eduCourseCollect){
		eduCourseCollectService.save(eduCourseCollect);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduCourseCollectEntity eduCourseCollect){
		eduCourseCollectService.updateById(eduCourseCollect);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduCourseCollectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
