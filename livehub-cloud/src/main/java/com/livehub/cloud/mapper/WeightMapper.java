package com.livehub.cloud.mapper;

import com.livehub.cloud.domain.Weight;

import java.util.List;

/**
 * 体重信息Mapper接口
 *
 * @author lmaster
 * @date 2019-12-23
 */
public interface WeightMapper {
    /**
     * 新增体重信息
     *
     * @param weight 体重信息
     * @return 结果
     */
    int insert(Weight weight);

    /**
     * 查询体重信息列表
     *
     * @param weight 体重信息
     * @return 体重信息集合
     */
    List<Weight> select(Weight weight);
}
