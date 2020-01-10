package com.livehub.cloud.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Lmaster
 */
@ApiModel(value = "Height", description = "身高数据实体")
public class Height extends CloudBaseEntity {

    private static final long serialVersionUID = -1345627547040681305L;

    @ApiModelProperty("身高数据")
    @Setter
    @Getter
    private Short height;
}
