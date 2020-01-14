package com.livehub.system.service;

import com.livehub.cloud.domain.LoginDevice;
import com.livehub.system.domain.LhEquipment;

import java.util.List;

/**
 * 设备信息Service接口
 *
 * @author lmaster
 * @date 2019-12-16
 */
public interface ILhEquipmentService {
    /**
     * 查询设备信息
     *
     * @param equipmentId 设备信息ID
     * @return 设备信息
     */
    LhEquipment selectLhEquipmentById(Long equipmentId);

    /**
     * 查询设备信息列表
     *
     * @param lhEquipment 设备信息
     * @return 设备信息集合
     */
    List<LhEquipment> selectLhEquipmentList(LhEquipment lhEquipment);

    /**
     * 新增设备信息
     *
     * @param lhEquipment 设备信息
     * @return 结果
     */
    int insertLhEquipment(LhEquipment lhEquipment);

    /**
     * 修改设备信息
     *
     * @param lhEquipment 设备信息
     * @return 结果
     */
    int updateLhEquipment(LhEquipment lhEquipment);

    /**
     * 批量删除设备信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteLhEquipmentByIds(String ids);

    /**
     * 删除设备信息信息
     *
     * @param equipmentId 设备信息ID
     * @return 结果
     */
    int deleteLhEquipmentById(Long equipmentId);

    /**
     * 设备登录
     *
     * @param lhEquipment 设备信息
     * @return 设备登录对象
     */
    LoginDevice login(LhEquipment lhEquipment);

}
