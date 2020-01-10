package com.livehub.web.controller.system;

import com.livehub.cloud.domain.Height;
import com.livehub.cloud.service.HeightService;
import com.livehub.common.annotation.Log;
import com.livehub.common.core.controller.BaseController;
import com.livehub.common.core.domain.AjaxResult;
import com.livehub.common.core.page.TableDataInfo;
import com.livehub.common.enums.BusinessType;
import com.livehub.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 高度信息Controller
 *
 * @author lmaster
 * @date 2019-12-19
 */
@Controller
@RequestMapping("/cloud/height")
public class LhcHeightController extends BaseController {
    private String prefix = "cloud/height";

    private HeightService heightService;

    @Autowired
    public void setHeightService(HeightService heightService) {
        this.heightService = heightService;
    }

    @RequiresPermissions("cloud:height:view")
    @GetMapping()
    public String height() {
        return prefix + "/height";
    }

    /**
     * 查询高度信息列表
     */
    @RequiresPermissions("cloud:height:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Height height) {
        startPage();
        List<Height> list = heightService.select(height);
        return getDataTable(list);
    }

    /**
     * 导出高度信息列表
     */
    @RequiresPermissions("cloud:height:export")
    @Log(title = "高度信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Height height) {
        List<Height> list = heightService.select(height);
        ExcelUtil<Height> util = new ExcelUtil<Height>(Height.class);
        return util.exportExcel(list, "height");
    }

    /**
     * 新增高度信息
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存高度信息
     */
    @RequiresPermissions("cloud:height:add")
    @Log(title = "高度信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Height height) {
        return toAjax(heightService.insert(height));
    }

}
