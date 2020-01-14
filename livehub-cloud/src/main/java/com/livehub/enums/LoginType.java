package com.livehub.enums;

/**
 * @author Lmaster
 */

public enum LoginType {
    /**
     * 用户
     */
    USER("User"),
    /**
     * 管理员
     */
    ADMIN("Admin"),
    /**
     * 设备
     */
    DEVICE("Device");

    private String type;

    private LoginType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
