package com.livehub.cloud.domain;

import com.livehub.LiveHubApplicationTests;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HeightTest extends LiveHubApplicationTests {

    @Test
    public void height(){
        Height height=new Height();
        height.setTs(new Date());
        height.setDid(123L);
        height.setOid("test");
        height.setTid(456L);
        height.setHeight(Short.parseShort("789"));
        System.out.println(height.toString());
    }

    @Test
    public void heights(){
        Heights heights=new Heights();
        heights.setTs(new Date());
        heights.setHeight(Short.parseShort("789"));
        System.out.println(heights);

    }
}
