package com.livehub.cloud.service.impl;

import com.livehub.LiveHubApplicationTests;
import com.livehub.cloud.domain.Height;
import com.livehub.cloud.service.HeightService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


public class HeightServiceImplTest extends LiveHubApplicationTests {

    private HeightService heightService;

    @Autowired
    public void setHeightService(HeightService heightService) {
        this.heightService = heightService;
    }

    @Test
    public void insertLhCHeight() {
        Height height = new Height();
        height.setTs(new Date());
        height.setDid(2L);
        height.setOid("1200456");
        height.setHeight(Short.parseShort("789"));
        System.out.println(heightService.insert(height));
    }

    @Test
    public void selectLhCHeightList() {
        Height height = new Height();
        height.setTs(new Date());
        height.setDid(2L);
        height.setOid("123456");
        height.setHeight(Short.parseShort("789"));
        System.out.println(heightService.select(height));
    }
}
