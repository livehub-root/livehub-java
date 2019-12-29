package com.livehub.system.service;

import com.livehub.system.domain.LhTask;
import java.util.List;

/**
 * 任务列表Service接口
 * 
 * @author Lmaster
 * @date 2019-11-22
 */
public interface ILhTaskService 
{
    /**
     * 查询任务列表
     * 
     * @param taskId 任务列表ID
     * @return 任务列表
     */
    public LhTask selectLhTaskById(Long taskId);

    /**
     * 查询任务列表列表
     * 
     * @param lhTask 任务列表
     * @return 任务列表集合
     */
    public List<LhTask> selectLhTaskList(LhTask lhTask);

    /**
     * 新增任务列表
     * 
     * @param lhTask 任务列表
     * @return 结果
     */
    public int insertLhTask(LhTask lhTask);

    /**
     * 修改任务列表
     * 
     * @param lhTask 任务列表
     * @return 结果
     */
    public int updateLhTask(LhTask lhTask);

    /**
     * 批量删除任务列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLhTaskByIds(String ids);

    /**
     * 删除任务列表信息
     * 
     * @param taskId 任务列表ID
     * @return 结果
     */
    public int deleteLhTaskById(Long taskId);
}
