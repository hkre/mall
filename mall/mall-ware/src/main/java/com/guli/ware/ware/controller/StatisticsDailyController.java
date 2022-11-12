package com.guli.ware.ware.controller;

import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;
import com.guli.ware.ware.entity.StatisticsDailyEntity;
import com.guli.ware.ware.service.StatisticsDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 网站统计日数据
 *
 * @author chenfeifei
 * @email sunlightcs@gmail.com
 * @date 2022-11-12 13:51:18
 */
@RestController
@RequestMapping("ware/statisticsdaily")
public class StatisticsDailyController {
    @Autowired
    private StatisticsDailyService statisticsDailyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = statisticsDailyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		StatisticsDailyEntity statisticsDaily = statisticsDailyService.getById(id);

        return R.ok().put("statisticsDaily", statisticsDaily);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody StatisticsDailyEntity statisticsDaily){
		statisticsDailyService.save(statisticsDaily);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody StatisticsDailyEntity statisticsDaily){
		statisticsDailyService.updateById(statisticsDaily);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		statisticsDailyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
