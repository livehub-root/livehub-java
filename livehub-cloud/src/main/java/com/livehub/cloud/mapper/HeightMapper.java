package com.livehub.cloud.mapper;

import com.livehub.cloud.domain.Height;

import java.util.Date;
import java.util.List;

/**
 * 高度信息Mapper接口
 *
 * @author lmaster
 * @date 2019-12-19
 */
public interface LhCHeightMapper
{
    /**
     * 查询高度信息
     *
     * @param ts 高度信息ID
     * @return 高度信息
     */
    public Height selectLhCHeightById(Date ts);

    /**
     * 查询高度信息列表
     *
     * @param lhcHeight 高度信息
     * @return 高度信息集合
     */
    public List<Height> selectLhCHeightList(Height lhcHeight);

    /**
     * 新增高度信息
     *
     * @param lhcHeight 高度信息
     * @return 结果
     */
    public int insertLhCHeight(Height lhcHeight);

    /**
     * 修改高度信息
     *
     * @param lhcHeight 高度信息
     * @return 结果
     */
    public int updateLhCHeight(Height lhcHeight);

    /**
     * 删除高度信息
     *
     * @param ts 高度信息ID
     * @return 结果
     */
    public int deleteLhCHeightById(Date ts);

    /**
     * 批量删除高度信息
     *
     * @param tss 需要删除的数据ID
     * @return 结果
     */
    public int deleteLhCHeightByIds(String[] tss);

    public void createTable();
}
