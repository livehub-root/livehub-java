package com.livehub.cloud.service;
import com.livehub.cloud.mapper.InitMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lmaster
 */
public class InitService {

    private InitMapper initMapper;

    @Autowired
    public void setInitMapper(InitMapper initMapper) {
        this.initMapper = initMapper;
    }

    void createDataBase(){
        this.initMapper.createDataBase();
    }

    void createTableHeight(){
        this.initMapper.createTableHeight();
    }

    void createTableWeight(){
        this.initMapper.createTableWeight();
    }
}
