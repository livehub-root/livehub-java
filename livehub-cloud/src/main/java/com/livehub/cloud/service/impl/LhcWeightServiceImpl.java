package com.livehub.cloud.service.impl;


import java.sql.Timestamp;
import java.util.List;

import com.livehub.common.annotation.DataSource;
import com.livehub.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.livehub.cloud.mapper.LhcWeightMapper;
import com.livehub.cloud.domain.LhcWeight;
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
    public LhcWeight selectLhcWeightById(Timestamp ts)
    {
        return lhcWeightMapper.selectLhcWeightById(ts);
    }

    /**
     * 查询体重信息列表
     * 
     * @param lhcWeight 体重信息
     * @return 体重信息
     */
    @Override
    public List<LhcWeight> selectLhcWeightList(LhcWeight lhcWeight)
    {
        return lhcWeightMapper.selectLhcWeightList(lhcWeight);
    }

    /**
     * 新增体重信息
     * 
     * @param lhcWeight 体重信息
     * @return 结果
     */
    @Override
    public int insertLhcWeight(LhcWeight lhcWeight)
    {
        return lhcWeightMapper.insertLhcWeight(lhcWeight);
    }

    /**
     * 修改体重信息
     * 
     * @param lhcWeight 体重信息
     * @return 结果
     */
    @Override
    public int updateLhcWeight(LhcWeight lhcWeight)
    {
        return lhcWeightMapper.updateLhcWeight(lhcWeight);
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
