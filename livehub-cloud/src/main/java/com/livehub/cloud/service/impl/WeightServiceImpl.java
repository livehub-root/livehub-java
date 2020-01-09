package com.livehub.cloud.service.impl;


import java.sql.Timestamp;
import java.util.List;

import com.livehub.common.annotation.DataSource;
import com.livehub.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.livehub.cloud.mapper.LhcWeightMapper;
import com.livehub.cloud.domain.Weight;
import com.livehub.cloud.service.ILhcWeightService;
import com.livehub.common.core.text.Convert;

/**
 * 体重信息Service业务层处理
 * 
 * @author lmaster
 * @date 2019-12-23
 */
@Service
@DataSource(value = DataSourceType.TAOS)
public class LhcWeightServiceImpl implements ILhcWeightService 
{
    @Autowired
    private LhcWeightMapper lhcWeightMapper;

    /**
     * 查询体重信息
     * 
     * @param ts 体重信息ID
     * @return 体重信息
     */
    @Override
    public Weight selectLhcWeightById(Timestamp ts)
    {
        return lhcWeightMapper.selectLhcWeightById(ts);
    }

    /**
     * 查询体重信息列表
     * 
     * @param weight 体重信息
     * @return 体重信息
     */
    @Override
    public List<Weight> selectLhcWeightList(Weight weight)
    {
        return lhcWeightMapper.selectLhcWeightList(weight);
    }

    /**
     * 新增体重信息
     * 
     * @param weight 体重信息
     * @return 结果
     */
    @Override
    public int insertLhcWeight(Weight weight)
    {
        return lhcWeightMapper.insertLhcWeight(weight);
    }

    /**
     * 修改体重信息
     * 
     * @param weight 体重信息
     * @return 结果
     */
    @Override
    public int updateLhcWeight(Weight weight)
    {
        return lhcWeightMapper.updateLhcWeight(weight);
    }

    /**
     * 删除体重信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLhcWeightByIds(String ids)
    {
        return lhcWeightMapper.deleteLhcWeightByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除体重信息信息
     * 
     * @param ts 体重信息ID
     * @return 结果
     */
    @Override
    public int deleteLhcWeightById(Timestamp ts)
    {
        return lhcWeightMapper.deleteLhcWeightById(ts);
    }

    @Override
    public void createWeightTable(){ lhcWeightMapper.createWeightTable();}
}
