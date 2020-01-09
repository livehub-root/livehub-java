package com.livehub.cloud.service.impl;

import com.livehub.cloud.domain.Height;
import com.livehub.cloud.mapper.HeightMapper;
import com.livehub.cloud.service.HeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lmaster
 */
@Service
public class HeightServiceImpl implements HeightService {

    private HeightMapper heightMapper;

    @Autowired
    public void setHeightMapper(HeightMapper heightMapper) {
        this.heightMapper = heightMapper;
    }

    /**
     * 新增高度信息
     *
     * @param lhcHeight 高度信息
     * @return 结果
     */
    @Override
    public int insert(Height lhcHeight) {
        return heightMapper.insert(lhcHeight);
    }

    /**
     * 查询高度信息列表
     *
     * @param height 高度信息
     * @return 高度信息
     */
    @Override
    public List<Height> select(Height height) {
        return heightMapper.select(height);
    }
}
