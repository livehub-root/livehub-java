package com.livehub.auth;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author Lmaster
 */
public class CustomizedToken extends UsernamePasswordToken {

    private static final long serialVersionUID = -4399441417669111908L;

    private String loginType;

    public CustomizedToken(final String username, final String password, final boolean rememberMe, String loginType) {
        super(username, password, rememberMe);
        this.loginType = loginType;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
