package com.livehub.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.livehub.common.annotation.Excel;
import com.livehub.common.core.domain.BaseEntity;

/**
 * 设备信息对象 lh_equipment
 * 
 * @author lmaster
 * @date 2019-12-16
 */
public class LhEquipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private Long equipmentId;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String equipmentNo;

    /** 地理位置 */
    @Excel(name = "地理位置")
    private String location;

    public void setEquipmentId(Long equipmentId) 
    {
        this.equipmentId = equipmentId;
    }

    public Long getEquipmentId() 
    {
        return equipmentId;
    }
    public void setEquipmentNo(String equipmentNo) 
    {
        this.equipmentNo = equipmentNo;
    }

    public String getEquipmentNo() 
    {
        return equipmentNo;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("equipmentId", getEquipmentId())
            .append("equipmentNo", getEquipmentNo())
            .append("location", getLocation())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
