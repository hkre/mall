package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.product.entity.EduChapterEntity;
import com.guli.product.service.EduChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("product/educhapter")
public class EduChapterController {
    @Autowired
    private EduChapterService eduChapterService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduChapterService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduChapterEntity eduChapter = eduChapterService.getById(id);

        return R.ok().put("eduChapter", eduChapter);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduChapterEntity eduChapter){
		eduChapterService.save(eduChapter);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduChapterEntity eduChapter){
		eduChapterService.updateById(eduChapter);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduChapterService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
