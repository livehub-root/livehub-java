package com.livehub.cloud.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Lmaster
 */
@Data
@ApiModel(value="Height", description="身高数据实体")
public class Height {

    @ApiModelProperty(name = "ts", value = "时间戳", example = "2016-01-01 01:00:00",dataType = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ts;

    @ApiModelProperty("牛编号")
    private String oid;

    @ApiModelProperty("身高数据")
    private Short height;

    @ApiModelProperty("设备ID")
    private Long did;
}
