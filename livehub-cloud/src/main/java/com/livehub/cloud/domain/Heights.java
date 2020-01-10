package com.livehub.cloud.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Administrator
 */
public class Heights extends CloudBaseEntitys {

    private static final long serialVersionUID = -460892022466138764L;

    @ApiModelProperty("身高数据")
    @Setter
    @Getter
    private Short height;
}
