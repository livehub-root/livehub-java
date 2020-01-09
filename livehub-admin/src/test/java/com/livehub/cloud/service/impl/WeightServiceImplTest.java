package com.livehub.cloud.service.impl;

import com.livehub.LiveHubApplication;
import com.livehub.cloud.domain.Weight;
import com.livehub.cloud.mapper.WeightMapper;
import com.livehub.cloud.service.WeightService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {LiveHubApplication.class})// 指定启动类
public class WeightServiceImplTest {

    @Resource
    private WeightService lhcWeightService;

    @Resource
    private WeightMapper weightMapper;

    @Test
    public void init() {
        lhcWeightService.createWeightTable();
    }

    @Test
    public void selectLhcWeightList() {
        Weight weight = new Weight();
        weight.setTs(new Timestamp(new Date().getTime()));
        weight.setDid(2L);
        weight.setOid("1200456");
        weight.setWeight(789);
        System.out.println(lhcWeightService.selectLhcWeightList(weight));
    }



    @Test
    public void insertLhcWeight() {
        Weight weight = new Weight();
        weight.setTs(new Timestamp(new Date().getTime()));
        weight.setDid(2L);
        weight.setOid("1200456");
        weight.setWeight(789);
        System.out.println(lhcWeightService.insertLhcWeight(weight));
    }



}
