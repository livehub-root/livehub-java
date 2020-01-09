package com.livehub.cloud.service;

import com.livehub.cloud.domain.Height;

import java.util.List;

/**
 * 高度信息Service接口
 *
 * @author lmaster
 * @date 2019-12-19
 */
public interface HeightService extends CloudBase<Height> {

    /**
     * 新增高度信息
     *
     * @param height 高度信息
     * @return 结果
     */
    @Override
    int insert(Height height);

    /**
     * 查询高度信息列表
     *
     * @param height 高度信息
     * @return 高度信息集合
     */
    @Override
    List<Height> select(Height height);
}
