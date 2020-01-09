package com.livehub.cloud.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 体重信息对象
 *
 * @author lmaster
 * @date 2019-12-23
 */
@Data
@ApiModel(value = "Weight", description = "体重数据实体")
public class Weight {

    @ApiModelProperty(name = "ts", value = "时间戳", example = "2016-01-01 01:00:00", dataType = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ts;

    @ApiModelProperty("牛编号")
    private String oid;

    @ApiModelProperty("体重数据")
    private Integer weight;

    @ApiModelProperty("设备ID")
    private Long did;
}
