package com.livehub.web.controller.cloud;

import com.livehub.cloud.domain.Weight;
import com.livehub.cloud.service.WeightService;
import com.livehub.common.annotation.Log;
import com.livehub.common.core.controller.BaseController;
import com.livehub.common.core.domain.AjaxResult;
import com.livehub.common.core.page.TableDataInfo;
import com.livehub.common.enums.BusinessType;
import com.livehub.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * 体重信息Controller
 * 
 * @author lmaster
 * @date 2019-12-23
 */
@Controller
@RequestMapping("/cloud/weight")
public class LhcWeightController extends BaseController
{
    private String prefix = "cloud/weight";

    @Autowired
    private WeightService lhcWeightService;

    @RequiresPermissions("cloud:weight:view")
    @GetMapping()
    public String weight()
    {
        return prefix + "/weight";
    }

    /**
     * 查询体重信息列表
     */
    @RequiresPermissions("cloud:weight:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Weight weight)
    {
        startPage();
        List<Weight> list = lhcWeightService.selectLhcWeightList(weight);
        return getDataTable(list);
    }

    /**
     * 导出体重信息列表
     */
    @RequiresPermissions("cloud:weight:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Weight weight)
    {
        List<Weight> list = lhcWeightService.selectLhcWeightList(weight);
        ExcelUtil<Weight> util = new ExcelUtil<Weight>(Weight.class);
        return util.exportExcel(list, "weight");
    }

    /**
     * 新增体重信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存体重信息
     */
    @RequiresPermissions("cloud:weight:add")
    @Log(title = "体重信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Weight weight)
    {
        return toAjax(lhcWeightService.insertLhcWeight(weight));
    }

    /**
     * 修改体重信息
     */
    @GetMapping("/edit/{ts}")
    public String edit(@PathVariable("ts") Timestamp ts, ModelMap mmap)
    {
        Weight weight = lhcWeightService.selectLhcWeightById(ts);
        mmap.put("weight", weight);
        return prefix + "/edit";
    }

    /**
     * 修改保存体重信息
     */
    @RequiresPermissions("cloud:weight:edit")
    @Log(title = "体重信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Weight weight)
    {
        return toAjax(lhcWeightService.updateLhcWeight(weight));
    }

    /**
     * 删除体重信息
     */
    @RequiresPermissions("cloud:weight:remove")
    @Log(title = "体重信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lhcWeightService.deleteLhcWeightByIds(ids));
    }
}
