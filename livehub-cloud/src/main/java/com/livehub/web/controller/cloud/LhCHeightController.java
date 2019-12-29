package com.livehub.web.controller.cloud;

import com.livehub.cloud.domain.LhCHeight;
import com.livehub.cloud.service.LhCHeightService;
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
@Api(tags = "Height",description = "身高数据管理")
@RestController
@RequestMapping("/api/cloud/height")
public class LhCHeightController extends BaseController {
    @Autowired
    private LhCHeightService lhcHeightService;

    @ApiOperation("获取身高数据列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "height", value = "身高数据", required = false, dataType = "short"),
            @ApiImplicitParam(name = "oid", value = "牛编号", required = false, dataType = "string"),
            @ApiImplicitParam(name = "did", value = "设备ID", required = false, dataType = "long"),
    })
    @GetMapping("")
    public AjaxResult select(@RequestParam(value = "height", defaultValue = "0") Short height,
                             @RequestParam(value = "oid", defaultValue = "") String oid,
                             @RequestParam(value = "did", defaultValue = "0") Long did) {
        LhCHeight lhCHeight = new LhCHeight();
        lhCHeight.setHeight(height);
        lhCHeight.setOid(oid);
        lhCHeight.setDid(did);
        logger.debug(lhCHeight.toString());
        List<LhCHeight> heightList = lhcHeightService.selectLhCHeightList(lhCHeight);
        return AjaxResult.success(heightList);
    }

    @ApiOperation("提交身高数据")
    @ApiImplicitParam(name = "height", value = "身高数据", dataType = "LhCHeight")
    @PostMapping("")
    public AjaxResult insert(@RequestBody LhCHeight height) {
        logger.debug(height.toString());
        int res = lhcHeightService.insertLhCHeight(height);
        return AjaxResult.success(res);
    }
}
