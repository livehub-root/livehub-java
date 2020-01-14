package com.livehub.web.controller.cloud;

import com.livehub.cloud.domain.LoginDevice;
import com.livehub.common.core.controller.BaseController;
import com.livehub.common.core.domain.AjaxResult;
import com.livehub.system.domain.LhEquipment;
import com.livehub.system.service.ILhEquipmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 设备信息Controller
 *
 * @author lmaster
 */
@Api(tags = "Device", description = "设备数据管理")
@RestController
@RequestMapping("/api/cloud/device")
public class DeviceController extends BaseController {

    private ILhEquipmentService equipmentService;

    @Autowired
    public void setHeightService(ILhEquipmentService heightService) {
        this.equipmentService = heightService;
    }

    @ApiOperation("设备登录")
    @ApiImplicitParam(name = "device", value = "设备登录信息", dataType = "LhEquipment")
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LhEquipment equipment) {
        LoginDevice loginDevice = equipmentService.login(equipment);
        return AjaxResult.success(loginDevice);
    }
}
