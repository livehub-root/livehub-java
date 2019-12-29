package com.livehub.cloud.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

@ApiModel(value="LhCHeight", description="身高数据实体")
public class LhCHeight {

    @ApiModelProperty(name = "ts", value = "时间戳", example = "2016-01-01",dataType = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ts;

    @ApiModelProperty("牛编号")
    private String oid;

    @ApiModelProperty("身高数据")
    private Short height;

    @ApiModelProperty("设备ID")
    private Long did;

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("ts", getTs())
                .append("oid", getOid())
                .append("height", getHeight())
                .append("did", getDid())
                .toString();
    }
}
