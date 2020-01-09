package com.livehub.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.livehub.common.annotation.Excel;
import com.livehub.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 设备信息对象 lh_equipment
 *
 * @author lmaster
 * @date 2019-12-16
 */
@Data
public class LhEquipment extends BaseEntity {

    private static final long serialVersionUID = 6771906229802334866L;

    /**
     * 设备ID
     */
    private Long equipmentId;

    /**
     * 注册码
     */
    private String registrationCode;

    /**
     * token 代币
     */
    private String token;


    @Excel(name = "设备编号")
    private String equipmentNo;

    @Excel(name = "地理位置")
    private String location;

    @Excel(name = "设备名称")
    private String deviceName;

    @Excel(name = "设备类型")
    private String deviceType;

    @Excel(name = "供应商ID")
    private String venderId;

    @Excel(name = "供应商名称")
    private String venderName;

    @Excel(name = "设备型号")
    private String modelNumber;

    @Excel(name = "固件版本")
    private String firmwareVersion;

    @Excel(name = "固件更新日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date firmwareDate;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
