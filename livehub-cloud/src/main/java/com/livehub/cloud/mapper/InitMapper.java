package com.livehub.cloud.mapper;

/**
 * @author Lmaster
 */
public interface InitMapper {

    /**
     * 创建数据
     */
    void createDataBase();

    /**
     * 创建身高表
     */
    void createTableHeight();

    /**
     * 创建体重表
     */
    void createTableWeight();
}
