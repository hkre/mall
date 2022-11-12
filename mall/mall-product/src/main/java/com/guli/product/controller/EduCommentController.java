package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.product.entity.EduCommentEntity;
import com.guli.product.service.EduCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.guli.common.utils.R;
import java.util.Arrays;
import java.util.Map;




/**
 * 评论
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:10:47
 */
@RestController
@RequestMapping("product/educomment")
public class EduCommentController {
    @Autowired
    private EduCommentService eduCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = eduCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		EduCommentEntity eduComment = eduCommentService.getById(id);

        return R.ok().put("eduComment", eduComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EduCommentEntity eduComment){
		eduCommentService.save(eduComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody EduCommentEntity eduComment){
		eduCommentService.updateById(eduComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		eduCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
