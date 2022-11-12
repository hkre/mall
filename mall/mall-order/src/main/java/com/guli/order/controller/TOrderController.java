package com.guli.order.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.order.entity.TOrderEntity;
import com.guli.order.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;




/**
 * 订单
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:20:04
 */
@RestController
@RequestMapping("order/torder")
public class TOrderController {
    @Autowired
    private TOrderService tOrderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tOrderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		TOrderEntity tOrder = tOrderService.getById(id);

        return R.ok().put("tOrder", tOrder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TOrderEntity tOrder){
		tOrderService.save(tOrder);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TOrderEntity tOrder){
		tOrderService.updateById(tOrder);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		tOrderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
