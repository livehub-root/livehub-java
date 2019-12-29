package com.livehub.system.service.impl;

import java.util.List;
import com.livehub.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.livehub.system.mapper.LhTaskMapper;
import com.livehub.system.domain.LhTask;
import com.livehub.system.service.ILhTaskService;
import com.livehub.common.core.text.Convert;

/**
 * 任务列表Service业务层处理
 * 
 * @author Lmaster
 * @date 2019-11-22
 */
@Service
public class LhTaskServiceImpl implements ILhTaskService 
{
    @Autowired
    private LhTaskMapper lhTaskMapper;

    /**
     * 查询任务列表
     * 
     * @param taskId 任务列表ID
     * @return 任务列表
     */
    @Override
    public LhTask selectLhTaskById(Long taskId)
    {
        return lhTaskMapper.selectLhTaskById(taskId);
    }

    /**
     * 查询任务列表列表
     * 
     * @param lhTask 任务列表
     * @return 任务列表
     */
    @Override
    public List<LhTask> selectLhTaskList(LhTask lhTask)
    {
        return lhTaskMapper.selectLhTaskList(lhTask);
    }

    /**
     * 新增任务列表
     * 
     * @param lhTask 任务列表
     * @return 结果
     */
    @Override
    public int insertLhTask(LhTask lhTask)
    {
        lhTask.setCreateTime(DateUtils.getNowDate());
        return lhTaskMapper.insertLhTask(lhTask);
    }

    /**
     * 修改任务列表
     * 
     * @param lhTask 任务列表
     * @return 结果
     */
    @Override
    public int updateLhTask(LhTask lhTask)
    {
        lhTask.setUpdateTime(DateUtils.getNowDate());
        return lhTaskMapper.updateLhTask(lhTask);
    }

    /**
     * 删除任务列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLhTaskByIds(String ids)
    {
        return lhTaskMapper.deleteLhTaskByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除任务列表信息
     * 
     * @param taskId 任务列表ID
     * @return 结果
     */
    @Override
    public int deleteLhTaskById(Long taskId)
    {
        return lhTaskMapper.deleteLhTaskById(taskId);
    }
}
