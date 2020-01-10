package com.livehub.cloud.service.impl;

import com.livehub.LiveHubApplicationTests;
import com.livehub.cloud.domain.Weight;
import com.livehub.cloud.service.WeightService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class WeightServiceImplTest extends LiveHubApplicationTests {

    private WeightService weightService;

    @Autowired
    public void setWeightService(WeightService weightService) {
        this.weightService = weightService;
    }

    @Test
    public void selectLhcWeightList() {
        Weight weight = new Weight();
        weight.setTs(new Date());
        weight.setDid(2L);
        weight.setOid("1200456");
        weight.setWeight(789);
        System.out.println(weightService.select(weight));
    }


    @Test
    public void insertLhcWeight() {
        Weight weight = new Weight();
        weight.setTs(new Date());
        weight.setDid(2L);
        weight.setOid("1200456");
        weight.setWeight(789);
        System.out.println(weight.toString());
//        System.out.println(weightService.insert(weight));
    }
}
