package com.pengjiawei.scheduletasks;

import com.pengjiawei.utils.ConfigTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 彭家玮
 * @version V1.0
 * @className scheduletasks
 * @description //TODO 描述这个类的作用
 * @date 2017/5/23
 */
@Component
public class scheduletasks {
    @Autowired
    ConfigTool configTool;
    //readme.txt有cron表达式详解
    @Scheduled(cron="0 0 11 * * ?")
    public void sendSomething(){
        System.out.println("time = "+new Date()+"  config = "+configTool.getCron());
    }
}
