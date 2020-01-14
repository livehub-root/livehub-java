package com.livehub.auth;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author Lmaster
 */
public class DeviceToken extends UsernamePasswordToken {

    private static final long serialVersionUID = -8304379748387137619L;

    private String loginType;


    public DeviceToken(String loginName, String password, String usertype) {
        super(loginName, password);
        this.loginType = usertype;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
