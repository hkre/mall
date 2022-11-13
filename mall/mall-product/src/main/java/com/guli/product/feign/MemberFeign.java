package com.guli.product.feign;

import com.guli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("member")
public interface MemberFeign {

    @RequestMapping("member/user/getInfo")
    public R getInfo();
}
