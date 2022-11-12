package com.guli.member.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.member.entity.UserRoleEntity;
import com.guli.member.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
@RestController
@RequestMapping("member/userrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userRoleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		UserRoleEntity userRole = userRoleService.getById(id);

        return R.ok().put("userRole", userRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserRoleEntity userRole){
		userRoleService.save(userRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserRoleEntity userRole){
		userRoleService.updateById(userRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		userRoleService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
