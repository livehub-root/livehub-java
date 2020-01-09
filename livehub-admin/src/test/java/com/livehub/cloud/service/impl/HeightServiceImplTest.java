package com.livehub.cloud.service.impl;

import com.livehub.cloud.domain.Height;
import com.livehub.cloud.mapper.HeightMapper;
import com.livehub.cloud.service.HeightService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import com.livehub.LiveHubApplication;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {LiveHubApplication.class})// 指定启动类
public class HeightServiceImplTest {

    @Resource
    private HeightService lhcHeightService;

    @Resource
    private HeightMapper lhcHeightMapper;

    @Test
    public void createDB() {
    }

    @Test
    public void createTable() {
        lhcHeightService.createTable();
    }

    @Test
    public void insertLhCHeight() {
        Height height = new Height();
        height.setTs(new Date());
        height.setDid(2L);
        height.setOid("1200456");
        height.setHeight(Short.parseShort("789"));
        System.out.println(lhcHeightService.insertLhCHeight(height));
    }

    @Test
    public void selectLhCHeightList() {
        Height height = new Height();
//        height.setTs(new Timestamp(new Date().getTime()));
//        height.setDid(2L);
//        height.setOid("123456");
//        height.setHeight(Short.parseShort("789"));
        System.out.println(lhcHeightService.selectLhCHeightList(height));
    }
}
