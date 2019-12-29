package com.livehub.system.service.impl;

import java.util.List;
import com.livehub.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.livehub.system.mapper.LhEquipmentMapper;
import com.livehub.system.domain.LhEquipment;
import com.livehub.system.service.ILhEquipmentService;
import com.livehub.common.core.text.Convert;

/**
 * 设备信息Service业务层处理
 * 
 * @author lmaster
 * @date 2019-12-16
 */
@Service
public class LhEquipmentServiceImpl implements ILhEquipmentService 
{
    @Autowired
    private LhEquipmentMapper lhEquipmentMapper;

    /**
     * 查询设备信息
     * 
     * @param equipmentId 设备信息ID
     * @return 设备信息
     */
    @Override
    public LhEquipment selectLhEquipmentById(Long equipmentId)
    {
        return lhEquipmentMapper.selectLhEquipmentById(equipmentId);
    }

    /**
     * 查询设备信息列表
     * 
     * @param lhEquipment 设备信息
     * @return 设备信息
     */
    @Override
    public List<LhEquipment> selectLhEquipmentList(LhEquipment lhEquipment)
    {
        return lhEquipmentMapper.selectLhEquipmentList(lhEquipment);
    }

    /**
     * 新增设备信息
     * 
     * @param lhEquipment 设备信息
     * @return 结果
     */
    @Override
    public int insertLhEquipment(LhEquipment lhEquipment)
    {
        lhEquipment.setCreateTime(DateUtils.getNowDate());
        return lhEquipmentMapper.insertLhEquipment(lhEquipment);
    }

    /**
     * 修改设备信息
     * 
     * @param lhEquipment 设备信息
     * @return 结果
     */
    @Override
    public int updateLhEquipment(LhEquipment lhEquipment)
    {
        lhEquipment.setUpdateTime(DateUtils.getNowDate());
        return lhEquipmentMapper.updateLhEquipment(lhEquipment);
    }

    /**
     * 删除设备信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLhEquipmentByIds(String ids)
    {
        return lhEquipmentMapper.deleteLhEquipmentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备信息信息
     * 
     * @param equipmentId 设备信息ID
     * @return 结果
     */
    @Override
    public int deleteLhEquipmentById(Long equipmentId)
    {
        return lhEquipmentMapper.deleteLhEquipmentById(equipmentId);
    }
}
