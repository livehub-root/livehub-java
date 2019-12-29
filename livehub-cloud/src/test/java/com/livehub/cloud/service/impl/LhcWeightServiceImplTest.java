package com.livehub.cloud.service.impl;

import com.livehub.LiveHubCloudApplication;
import com.livehub.cloud.domain.LhcWeight;
import com.livehub.cloud.mapper.LhcWeightMapper;
import com.livehub.cloud.service.ILhcWeightService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {LiveHubCloudApplication.class})// 指定启动类
public class LhcWeightServiceImplTest {

    @Resource
    private ILhcWeightService lhcWeightService;

    @Resource
    private LhcWeightMapper lhcWeightMapper;

    @Test
    public void init() {
        lhcWeightService.createWeightTable();
    }

    @Test
    public void selectLhcWeightList() {
        LhcWeight weight = new LhcWeight();
        weight.setTs(new Timestamp(new Date().getTime()));
        weight.setDid(2L);
        weight.setOid("1200456");
        weight.setWeight(789);
        System.out.println(lhcWeightService.selectLhcWeightList(weight));
    }



    @Test
    public void insertLhcWeight() {
        LhcWeight weight = new LhcWeight();
        weight.setTs(new Timestamp(new Date().getTime()));
        weight.setDid(2L);
        weight.setOid("1200456");
        weight.setWeight(789);
        System.out.println(lhcWeightService.insertLhcWeight(weight));
    }



}