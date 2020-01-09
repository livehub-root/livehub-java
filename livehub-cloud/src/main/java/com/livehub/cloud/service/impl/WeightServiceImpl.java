package com.livehub.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.livehub.cloud.mapper.WeightMapper;
import com.livehub.cloud.domain.Weight;
import com.livehub.cloud.service.WeightService;

/**
 * 体重信息Service业务层处理
 *
 * @author lmaster
 * @date 2019-12-23
 */
@Service
public class WeightServiceImpl implements WeightService {

    private WeightMapper weightMapper;

    @Autowired
    public void setWeightMapper(WeightMapper weightMapper) {
        this.weightMapper = weightMapper;
    }

    /**
     * 新增体重信息
     *
     * @param weight 体重信息
     * @return 结果
     */
    @Override
    public int insert(Weight weight) {
        return weightMapper.insert(weight);
    }

    /**
     * 查询体重信息列表
     *
     * @param weight 体重信息
     * @return 体重信息
     */
    @Override
    public List<Weight> select(Weight weight) {
        return weightMapper.select(weight);
    }
}
