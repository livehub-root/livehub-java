package com.livehub.web.controller.system;

import com.livehub.common.annotation.Log;
import com.livehub.common.core.controller.BaseController;
import com.livehub.common.core.domain.AjaxResult;
import com.livehub.common.core.page.TableDataInfo;
import com.livehub.common.enums.BusinessType;
import com.livehub.common.utils.poi.ExcelUtil;
import com.livehub.system.domain.LhTask;
import com.livehub.system.service.ILhTaskService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 任务列表Controller
 * 
 * @author Lmaster
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/system/task")
public class LhTaskController extends BaseController
{
    private String prefix = "system/task";

    @Autowired
    private ILhTaskService lhTaskService;

    @RequiresPermissions("system:task:view")
    @GetMapping()
    public String task()
    {
        return prefix + "/task";
    }

    /**
     * 查询任务列表列表
     */
    @RequiresPermissions("system:task:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LhTask lhTask)
    {
        startPage();
        List<LhTask> list = lhTaskService.selectLhTaskList(lhTask);
        return getDataTable(list);
    }

    /**
     * 导出任务列表列表
     */
    @RequiresPermissions("system:task:export")
    @Log(title = "任务列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LhTask lhTask)
    {
        List<LhTask> list = lhTaskService.selectLhTaskList(lhTask);
        ExcelUtil<LhTask> util = new ExcelUtil<LhTask>(LhTask.class);
        return util.exportExcel(list, "task");
    }

    /**
     * 新增任务列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存任务列表
     */
    @RequiresPermissions("system:task:add")
    @Log(title = "任务列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LhTask lhTask)
    {
        return toAjax(lhTaskService.insertLhTask(lhTask));
    }

    /**
     * 修改任务列表
     */
    @GetMapping("/edit/{taskId}")
    public String edit(@PathVariable("taskId") Long taskId, ModelMap mmap)
    {
        LhTask lhTask = lhTaskService.selectLhTaskById(taskId);
        mmap.put("lhTask", lhTask);
        return prefix + "/edit";
    }

    /**
     * 修改保存任务列表
     */
    @RequiresPermissions("system:task:edit")
    @Log(title = "任务列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LhTask lhTask)
    {
        return toAjax(lhTaskService.updateLhTask(lhTask));
    }

    /**
     * 删除任务列表
     */
    @RequiresPermissions("system:task:remove")
    @Log(title = "任务列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lhTaskService.deleteLhTaskByIds(ids));
    }
}
