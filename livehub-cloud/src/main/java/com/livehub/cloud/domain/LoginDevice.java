package com.livehub.cloud.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.livehub.system.domain.LhEquipment;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Lmaster
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class LoginDevice {
    /**
     * 设备
     */
    private LhEquipment device;

    /**
     * token (header的键名)
     */
    private String token;
}
