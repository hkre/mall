package com.guli.ware.ware.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.ware.ware.entity.CrmBannerEntity;
import com.guli.ware.ware.service.CrmBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 首页banner表
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:51:18
 */
@RestController
@RequestMapping("ware/crmbanner")
public class CrmBannerController {
    @Autowired
    private CrmBannerService crmBannerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = crmBannerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		CrmBannerEntity crmBanner = crmBannerService.getById(id);

        return R.ok().put("crmBanner", crmBanner);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CrmBannerEntity crmBanner){
		crmBannerService.save(crmBanner);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CrmBannerEntity crmBanner){
		crmBannerService.updateById(crmBanner);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		crmBannerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
