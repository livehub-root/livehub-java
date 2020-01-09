package com.livehub.cloud.service.impl;

import com.livehub.cloud.domain.Height;
import com.livehub.cloud.mapper.LhCHeightMapper;
import com.livehub.cloud.service.LhCHeightService;
import com.livehub.common.annotation.DataSource;
import com.livehub.common.core.text.Convert;
import com.livehub.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
@DataSource(value = DataSourceType.TAOS)
public class LhCHeightServiceImpl implements LhCHeightService {

    @Autowired
    private LhCHeightMapper lhcHeightMapper;

    /**
     * 查询高度信息
     *
     * @param ts 高度信息ID
     * @return 高度信息
     */
    @Override
    public Height selectLhCHeightById(Date ts) {
        return lhcHeightMapper.selectLhCHeightById(ts);
    }

    /**
     * 查询高度信息列表
     *
     * @param lhcHeight 高度信息
     * @return 高度信息
     */
    @Override
    public List<Height> selectLhCHeightList(Height lhcHeight) {
        return lhcHeightMapper.selectLhCHeightList(lhcHeight);
    }

    /**
     * 新增高度信息
     *
     * @param lhcHeight 高度信息
     * @return 结果
     */
    @Override
    public int insertLhCHeight(Height lhcHeight) {
        return lhcHeightMapper.insertLhCHeight(lhcHeight);
    }

    /**
     * 修改高度信息
     *
     * @param lhcHeight 高度信息
     * @return 结果
     */
    @Override
    public int updateLhCHeight(Height lhcHeight) {
        return lhcHeightMapper.updateLhCHeight(lhcHeight);
    }

    /**
     * 删除高度信息对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLhCHeightByIds(String ids) {
        return lhcHeightMapper.deleteLhCHeightByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高度信息信息
     *
     * @param ts 高度信息ID
     * @return 结果
     */
    @Override
    public int deleteLhCHeightById(Timestamp ts) {
        return lhcHeightMapper.deleteLhCHeightById(ts);
    }

    @Override
    public void createTable() {
        lhcHeightMapper.createTable();
    }
}
