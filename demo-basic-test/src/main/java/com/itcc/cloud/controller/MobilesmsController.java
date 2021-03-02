package com.itcc.cloud.controller;

import com.itcc.cloud.entities.Mobilesms;
import com.itcc.cloud.service.MobilesmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Controller
@Slf4j
public class MobilesmsController {

    @Resource
    MobilesmsService mobilesmsService;


    Mobilesms mobilesms = new Mobilesms();

    @GetMapping(value = "/")
    public void insertMobiletest(){
        long a= System.currentTimeMillis();//获取当前系统时间(毫秒)
        log.info("开始时间："+a);
        for(int i = 1;i<1000000;i++) {
            mobilesms.setUserId(UUID.randomUUID().toString().replace("-", ""));
            mobilesms.setMobile(getTel());
            mobilesms.setBillMonth(String.valueOf((int)(Math.random()*12+1)));
            mobilesms.setTime("2021-03-02");
            mobilesms.setPeerNumber(getTel());
            mobilesms.setLocation(null);
            mobilesms.setSendType("send");
            mobilesms.setMsgType("sms");
            mobilesms.setServiceName("网内");
            mobilesms.setFee((int)(Math.random()*100+1));
            mobilesms.setCreateTime(new Date());
            mobilesms.setLastModifyTime(new Date());
            mobilesmsService.insertMobile(mobilesms);
        }
        log.info("结束时间："+(System.currentTimeMillis()-a));


    }

    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }

    /**
     * 返回手机号码
     */
    private static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    private static String getTel() {
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String third=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+third;
    }

}


