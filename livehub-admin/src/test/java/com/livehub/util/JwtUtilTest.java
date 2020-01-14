package com.livehub.util;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class JwtUtilTest {

    @Test
    public void sign() {

        String sign = JwtUtil.sign("18888888888", "123456");
        log.warn("测试生成一个token\n" + sign);
    }
}
