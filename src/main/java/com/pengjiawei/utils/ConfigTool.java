package com.pengjiawei.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 彭家玮
 * @version V1.0
 * @className ConfigTool
 * @description //TODO 描述这个类的作用
 * @date 2017/5/23
 */
@Component
@ConfigurationProperties(prefix = "tasks")
public class ConfigTool {
    private String cron;

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}
