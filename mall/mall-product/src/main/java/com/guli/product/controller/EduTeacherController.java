package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.product.entity.EduTeacherEntity;
import com.guli.product.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 讲师
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@RestController
@RequestMapping("product/eduteacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduTeacherService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduTeacherEntity eduTeacher = eduTeacherService.getById(id);

        return R.ok().put("eduTeacher", eduTeacher);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduTeacherEntity eduTeacher){
		eduTeacherService.save(eduTeacher);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduTeacherEntity eduTeacher){
		eduTeacherService.updateById(eduTeacher);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduTeacherService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
