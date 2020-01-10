package com.livehub.cloud.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 体重信息对象
 *
 * @author lmaster
 * @date 2019-12-23
 */
@ApiModel(value = "Weight", description = "体重数据实体")
public class Weight extends CloudBaseEntity {

    private static final long serialVersionUID = -2016208284359378189L;

    @ApiModelProperty("体重数据")
    @Setter
    @Getter
    private Integer weight;
}
