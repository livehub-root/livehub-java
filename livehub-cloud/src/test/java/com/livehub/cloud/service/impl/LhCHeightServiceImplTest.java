package com.livehub.cloud.service.impl;

import com.livehub.LiveHubCloudApplication;
import com.livehub.cloud.domain.LhCHeight;
import com.livehub.cloud.mapper.LhCHeightMapper;
import com.livehub.cloud.service.LhCHeightService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {LiveHubCloudApplication.class})// 指定启动类
public class LhCHeightServiceImplTest {

    @Resource
    private LhCHeightService lhcHeightService;

    @Resource
    private LhCHeightMapper lhcHeightMapper;

    @Test
    public void createDB() {
    }

    @Test
    public void createTable() {
        lhcHeightService.createTable();
    }

    @Test
    public void insertLhCHeight() {
        LhCHeight height = new LhCHeight();
        height.setTs(new Date());
        height.setDid(2L);
        height.setOid("1200456");
        height.setHeight(Short.parseShort("789"));
        System.out.println(lhcHeightService.insertLhCHeight(height));
    }

    @Test
    public void selectLhCHeightList() {
        LhCHeight height = new LhCHeight();
        height.setTs(new Timestamp(new Date().getTime()));
        height.setDid(2L);
        height.setOid("123456");
        height.setHeight(Short.parseShort("789"));
        System.out.println(lhcHeightService.selectLhCHeightList(height));
    }
}