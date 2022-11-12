package com.guli.member.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.member.entity.RolePermissionEntity;
import com.guli.member.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 角色权限
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
@RestController
@RequestMapping("member/rolepermission")
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = rolePermissionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		RolePermissionEntity rolePermission = rolePermissionService.getById(id);

        return R.ok().put("rolePermission", rolePermission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RolePermissionEntity rolePermission){
		rolePermissionService.save(rolePermission);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RolePermissionEntity rolePermission){
		rolePermissionService.updateById(rolePermission);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		rolePermissionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
