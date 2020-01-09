package com.livehub.cloud.service;

import com.livehub.LiveHubApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class InitServiceTest extends LiveHubApplicationTests {

    private InitService initService;

    @Autowired
    public void setInitService(InitService initService) {
        this.initService = initService;
    }

    @Test
    public void createDataBase() {
        this.initService.createDataBase();
    }

    @Test
    public void createTableHeight() {
        this.initService.createTableHeight();
    }

    @Test
    public void createTableWeight() {
        this.initService.createTableWeight();
    }
}
