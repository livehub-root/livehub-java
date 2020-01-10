//package com.livehub.web.controller.system;
//
//import com.livehub.cloud.domain.Weight;
//import com.livehub.cloud.service.WeightService;
//import com.livehub.common.annotation.Log;
//import com.livehub.common.core.controller.BaseController;
//import com.livehub.common.core.domain.AjaxResult;
//import com.livehub.common.core.page.TableDataInfo;
//import com.livehub.common.enums.BusinessType;
//import com.livehub.common.utils.poi.ExcelUtil;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
///**
// * 体重信息Controller
// *
// * @author lmaster
// * @date 2019-12-23
// */
//@Controller
//@RequestMapping("/cloud/weight")
//public class LhcWeightController extends BaseController {
//    private String prefix = "cloud/weight";
//
//    private WeightService weightService;
//
//    @Autowired
//    public void setWeightService(WeightService weightService) {
//        this.weightService = weightService;
//    }
//
//    @RequiresPermissions("cloud:weight:view")
//    @GetMapping()
//    public String weight() {
//        return prefix + "/weight";
//    }
//
//    /**
//     * 查询体重信息列表
//     */
//    @RequiresPermissions("cloud:weight:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(Weight weight) {
//        startPage();
//        List<Weight> list = weightService.select(weight);
//        return getDataTable(list);
//    }
//
//    /**
//     * 导出体重信息列表
//     */
//    @RequiresPermissions("cloud:weight:export")
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(Weight weight) {
//        List<Weight> list = weightService.select(weight);
//        ExcelUtil<Weight> util = new ExcelUtil<Weight>(Weight.class);
//        return util.exportExcel(list, "weight");
//    }
//
//    /**
//     * 新增体重信息
//     */
//    @GetMapping("/add")
//    public String add() {
//        return prefix + "/add";
//    }
//
//    /**
//     * 新增保存体重信息
//     */
//    @RequiresPermissions("cloud:weight:add")
//    @Log(title = "体重信息", businessType = BusinessType.INSERT)
//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(Weight weight) {
//        return toAjax(weightService.insert(weight));
//    }
//}
