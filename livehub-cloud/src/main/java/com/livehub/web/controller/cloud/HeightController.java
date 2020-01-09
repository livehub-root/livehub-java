package com.livehub.web.controller.cloud;

import com.livehub.cloud.domain.Height;
import com.livehub.cloud.service.HeightService;
import com.livehub.common.core.controller.BaseController;
import com.livehub.common.core.domain.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 高度信息Controller
 *
 * @author lmaster
 * @date 2019-12-19
 */
@Api(tags = "Height", description = "身高数据管理")
@RestController
@RequestMapping("/api/cloud/height")
public class HeightController extends BaseController {

    private HeightService heightService;

    @Autowired
    public void setHeightService(HeightService heightService) {
        this.heightService = heightService;
    }

    @ApiOperation("获取身高数据列表")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "height", value = "身高数据", required = false, dataType = "short"),
        @ApiImplicitParam(name = "oid", value = "牛编号", required = false, dataType = "string"),
        @ApiImplicitParam(name = "did", value = "设备ID", required = false, dataType = "long"),
    })
    @GetMapping("")
    public AjaxResult select(@RequestParam(value = "height", defaultValue = "0") Short h,
                             @RequestParam(value = "oid", defaultValue = "") String oid,
                             @RequestParam(value = "did", defaultValue = "0") Long did) {
        Height height = new Height();
        height.setHeight(h);
        height.setOid(oid);
        height.setDid(did);
        logger.debug(height.toString());
        List<Height> heightList = heightService.select(height);
        return AjaxResult.success(heightList);
    }

    @ApiOperation("提交身高数据")
    @ApiImplicitParam(name = "height", value = "身高数据", dataType = "Height")
    @PostMapping("")
    public AjaxResult insert(@RequestBody Height height) {
        logger.debug(height.toString());
        int res = heightService.insert(height);
        return AjaxResult.success(res);
    }
}
