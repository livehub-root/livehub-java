package com.livehub.web.controller.system;

import com.livehub.common.annotation.Log;
import com.livehub.common.core.controller.BaseController;
import com.livehub.common.core.domain.AjaxResult;
import com.livehub.common.core.page.TableDataInfo;
import com.livehub.common.enums.BusinessType;
import com.livehub.common.utils.poi.ExcelUtil;
import com.livehub.system.domain.LhEquipment;
import com.livehub.system.service.ILhEquipmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备信息Controller
 * 
 * @author lmaster
 * @date 2019-12-16
 */
@Controller
@RequestMapping("/system/equipment")
public class LhEquipmentController extends BaseController
{
    private String prefix = "system/equipment";

    @Autowired
    private ILhEquipmentService lhEquipmentService;

    @RequiresPermissions("system:equipment:view")
    @GetMapping()
    public String equipment()
    {
        return prefix + "/equipment";
    }

    /**
     * 查询设备信息列表
     */
    @RequiresPermissions("system:equipment:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LhEquipment lhEquipment)
    {
        startPage();
        List<LhEquipment> list = lhEquipmentService.selectLhEquipmentList(lhEquipment);
        return getDataTable(list);
    }

    /**
     * 导出设备信息列表
     */
    @RequiresPermissions("system:equipment:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LhEquipment lhEquipment)
    {
        List<LhEquipment> list = lhEquipmentService.selectLhEquipmentList(lhEquipment);
        ExcelUtil<LhEquipment> util = new ExcelUtil<LhEquipment>(LhEquipment.class);
        return util.exportExcel(list, "equipment");
    }

    /**
     * 新增设备信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备信息
     */
    @RequiresPermissions("system:equipment:add")
    @Log(title = "设备信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LhEquipment lhEquipment)
    {
        return toAjax(lhEquipmentService.insertLhEquipment(lhEquipment));
    }

    /**
     * 修改设备信息
     */
    @GetMapping("/edit/{equipmentId}")
    public String edit(@PathVariable("equipmentId") Long equipmentId, ModelMap mmap)
    {
        LhEquipment lhEquipment = lhEquipmentService.selectLhEquipmentById(equipmentId);
        mmap.put("lhEquipment", lhEquipment);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备信息
     */
    @RequiresPermissions("system:equipment:edit")
    @Log(title = "设备信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LhEquipment lhEquipment)
    {
        return toAjax(lhEquipmentService.updateLhEquipment(lhEquipment));
    }

    /**
     * 删除设备信息
     */
    @RequiresPermissions("system:equipment:remove")
    @Log(title = "设备信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lhEquipmentService.deleteLhEquipmentByIds(ids));
    }
}
