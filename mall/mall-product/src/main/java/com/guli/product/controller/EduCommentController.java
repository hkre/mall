package com.guli.product.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.product.entity.EduCommentEntity;
import com.guli.product.feign.MemberFeign;
import com.guli.product.service.EduCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

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
@Slf4j
@RefreshScope
public class EduCommentController {
    @Autowired
    private EduCommentService eduCommentService;

    @Autowired
    private MemberFeign memberFeign;

    @Value("${productuser.name}")
    private String name;

    /**
     * 远程调用
     */
    @RequestMapping("/getInfoInvok")
    public R getInfo(){
//        R info = memberFeign.getInfo();
//        log.info("info{}",info);
        return R.ok().put("msg","ok").put("name",name);
    }


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
