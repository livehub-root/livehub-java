package com.livehub.cloud.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Cloud 下的基础实例
 * ts oid did tid
 *
 * @author Lmaster
 */
public class CloudBaseEntity implements Serializable {

    private static final long serialVersionUID = -5735616903193793195L;

    @ApiModelProperty(name = "ts", value = "时间戳", example = "2016-01-01 01:00:00", dataType = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Setter
    @Getter
    protected Date ts;

    @ApiModelProperty("对象ID")
    @Setter
    @Getter
    protected String oid;

    @ApiModelProperty("设备ID")
    @Setter
    @Getter
    protected Long did;

    @ApiModelProperty("任务ID")
    @Setter
    @Getter
    protected Long tid;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

