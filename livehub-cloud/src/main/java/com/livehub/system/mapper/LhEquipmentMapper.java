package com.livehub.system.mapper;

import com.livehub.cloud.domain.LoginDevice;
import com.livehub.system.domain.LhEquipment;

import java.util.List;

/**
 * 设备信息Mapper接口
 *
 * @author lmaster
 * @date 2019-12-16
 */
public interface LhEquipmentMapper {
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
     * 删除设备信息
     *
     * @param equipmentId 设备信息ID
     * @return 结果
     */
    int deleteLhEquipmentById(Long equipmentId);

    /**
     * 批量删除设备信息
     *
     * @param equipmentIds 需要删除的数据ID
     * @return 结果
     */
    int deleteLhEquipmentByIds(String[] equipmentIds);

    /**
     * 设备登录
     *
     * @param equipmentNo 设备编号
     * @param registrationCode 设备注册码
     * @return 设备信息
     */
    LhEquipment login(String equipmentNo, String registrationCode);
}
