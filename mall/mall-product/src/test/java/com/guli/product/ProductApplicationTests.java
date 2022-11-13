package com.guli.product;

import com.guli.product.service.EduSubjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    EduSubjectService eduSubjectService;

    @Test
    void contextLoads() {
//        EduSubjectEntity  eduSubjectEntity = new EduSubjectEntity();
//        eduSubjectEntity.setTitle("雍正王朝");
//        eduSubjectEntity.setGmtCreate(new Date());
//        eduSubjectEntity.setGmtModified(new Date());
//        eduSubjectService.save(eduSubjectEntity);

//        EduSubjectEntity  eduSubjectServiceById = eduSubjectService.getById(1178585108454121474L);
//        eduSubjectServiceById.setTitle("雍正皇帝");
//        eduSubjectService.updateById(eduSubjectServiceById);

//        LambdaQueryWrapper<EduSubjectEntity> wrapper = new LambdaQueryWrapper();
//        wrapper.eq(EduSubjectEntity::getTitle, "雍正皇帝");
//        EduSubjectEntity  eduSubjectServiceOne = eduSubjectService.getOne(wrapper);
//        System.out.println(eduSubjectServiceOne);
    }

}
