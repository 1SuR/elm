package com.elm.product.controller;

import com.elm.common_utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/business"})
@Api(
        tags = {"商家控制器"}
)
public class BusinessController {
    public BusinessController() {
    }

    @PostMapping({"/listBusinessByOrderTypeId"})
    @ApiOperation("根据点餐分类查询商家")
    public R listBusinessByOrderTypeId(@ApiParam("点餐分类") Integer OrderTypeId) throws Exception {
        return R.ok();
    }

    @PostMapping({"/getBusinessById"})
    @ApiOperation("根据商家Id查询商家")
    public R getBusinessById(@ApiParam("商家Id") Integer businessId) throws Exception {
        return R.ok();
    }
}
