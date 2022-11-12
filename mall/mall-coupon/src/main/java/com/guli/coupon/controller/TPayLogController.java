package com.guli.coupon.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.coupon.entity.TPayLogEntity;
import com.guli.coupon.service.TPayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 支付日志表
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:22:52
 */
@RestController
@RequestMapping("coupon/tpaylog")
public class TPayLogController {
    @Autowired
    private TPayLogService tPayLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tPayLogService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		TPayLogEntity tPayLog = tPayLogService.getById(id);

        return R.ok().put("tPayLog", tPayLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TPayLogEntity tPayLog){
		tPayLogService.save(tPayLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TPayLogEntity tPayLog){
		tPayLogService.updateById(tPayLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		tPayLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
