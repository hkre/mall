package com.guli.member.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.member.entity.PermissionEntity;
import com.guli.member.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 权限
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 12:12:53
 */
@RestController
@RequestMapping("member/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = permissionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		PermissionEntity permission = permissionService.getById(id);

        return R.ok().put("permission", permission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PermissionEntity permission){
		permissionService.save(permission);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PermissionEntity permission){
		permissionService.updateById(permission);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		permissionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
