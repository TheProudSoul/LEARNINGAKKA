package com.akkademy.messages;

/**
 * @Classname: app
 * @Date: 7/17/2019 8:52 AM
 * @Author: ZHENGLA
 * @Description:
 */
public class SetRequest {
    private final String key; // 应该始终在所有代码中优先使用不可变对象
    private final Object value;

    public SetRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
