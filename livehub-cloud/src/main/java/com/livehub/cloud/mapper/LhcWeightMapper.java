package com.livehub.cloud.mapper;

import com.livehub.cloud.domain.LhcWeight;


import java.sql.Timestamp;
import java.util.List;

/**
 * 体重信息Mapper接口
 * 
 * @author lmaster
 * @date 2019-12-23
 */
public interface LhcWeightMapper 
{
    /**
     * 查询体重信息
     * 
     * @param ts 体重信息ID
     * @return 体重信息
     */
    public LhcWeight selectLhcWeightById(Timestamp ts);

    /**
     * 查询体重信息列表
     * 
     * @param lhcWeight 体重信息
     * @return 体重信息集合
     */
    public List<LhcWeight> selectLhcWeightList(LhcWeight lhcWeight);

    /**
     * 新增体重信息
     * 
     * @param lhcWeight 体重信息
     * @return 结果
     */
    public int insertLhcWeight(LhcWeight lhcWeight);

    /**
     * 修改体重信息
     * 
     * @param lhcWeight 体重信息
     * @return 结果
     */
    public int updateLhcWeight(LhcWeight lhcWeight);

    /**
     * 删除体重信息
     * 
     * @param ts 体重信息ID
     * @return 结果
     */
    public int deleteLhcWeightById(Timestamp ts);

    /**
     * 批量删除体重信息
     * 
     * @param tss 需要删除的数据ID
     * @return 结果
     */
    public int deleteLhcWeightByIds(String[] tss);

    public void createWeightTable();
}
