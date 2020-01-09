package com.livehub.cloud.service;

import com.livehub.common.annotation.DataSource;
import com.livehub.common.enums.DataSourceType;

import java.util.List;

/**
 * @author Lmaster
 */
@DataSource(value = DataSourceType.TAOS)
public interface CloudBase<T> {

    /**
     * 插入数据
     *
     * @param t 实例
     * @return 0 1
     */
    int insert(T t);

    /**
     * 查询数据
     *
     * @param t 实例
     * @return 集合
     */
    List<T> select(T t);
}
