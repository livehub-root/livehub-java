package com.livehub.cloud.mapper;

import com.livehub.cloud.domain.Height;

import java.util.List;

/**
 * 高度信息Mapper接口
 *
 * @author lmaster
 * @date 2019-12-19
 */
public interface HeightMapper {
    /**
     * 新增高度信息
     *
     * @param height 高度信息
     * @return 结果
     */
    int insert(Height height);

    /**
     * 查询高度信息列表
     *
     * @param height 高度信息
     * @return 高度信息集合
     */
    List<Height> select(Height height);
}
