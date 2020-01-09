package com.livehub.cloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Timestamp;


/**
 * 体重信息对象 lhc_weight
 * 
 * @author lmaster
 * @date 2019-12-23
 */
public class LhcWeight
{


    /** 时间 */
    private Timestamp ts;

    /** 对象编号 */
    private String oid;

    /** 体重 */

    private Integer weight;

    /** 设备编号 */
    private Long did;

    public void setTs(Timestamp ts)
    {
        this.ts = ts;
    }

    public Timestamp getTs()
    {
        return ts;
    }
    public void setOid(String oid) 
    {
        this.oid = oid;
    }

    public String getOid() 
    {
        return oid;
    }
    public void setWeight(Integer weight)
    {
        this.weight = weight;
    }

    public Integer getWeight()
    {
        return weight;
    }
    public void setDid(Long did) 
    {
        this.did = did;
    }

    public Long getDid() 
    {
        return did;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ts", getTs())
            .append("oid", getOid())
            .append("weight", getWeight())
            .append("did", getDid())
            .toString();
    }
}
