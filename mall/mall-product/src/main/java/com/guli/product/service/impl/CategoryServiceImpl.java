package com.guli.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;
import com.guli.product.dao.CategoryDao;
import com.guli.product.entity.CategoryEntity;
import com.guli.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //组装成父子的树形结构
        List<CategoryEntity> level1Menus = entities.stream()
                .filter(v -> v.getParentCid() == 0)
                .map(menu -> {
                    menu.setCategoryEntityList(this.getChildren(menu, entities));
                    return menu;

                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort()==null?0:menu1.getSort())
                            - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());

        level1Menus.forEach(System.out::println);

        //将改

        return level1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity category, List<CategoryEntity> categoryEntityAll) {

        List<CategoryEntity> children = categoryEntityAll.stream().filter(v -> v.getParentCid() == category.getCatId())
                .map(menu -> {
                    menu.setCategoryEntityList(this.getChildren(menu, categoryEntityAll));
                    return menu;

                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort()==null?0:menu1.getSort())
                            - (menu2.getSort()==null?0:menu2.getSort());
                }).collect(Collectors.toList());
        return children;
    }

    ;

}