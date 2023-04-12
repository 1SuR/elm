package com.elm.product.controller;

import com.elm.common_utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/food"})
@Api(
        tags = {"食品控制器"}
)
public class FoodController {
    public FoodController() {
    }

    @PostMapping({"/listFoodByBusinessId"})
    @ApiOperation("根据商家Id查询食品")
    public R listFoodByBusinessId(@ApiParam(name = "商家Id") Integer foodId) throws Exception {
        return R.ok();
    }
}
