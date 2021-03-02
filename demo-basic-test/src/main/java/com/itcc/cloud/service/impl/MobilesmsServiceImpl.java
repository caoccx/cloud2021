package com.itcc.cloud.service.impl;

import com.itcc.cloud.dao.MobilesmsDao;
import com.itcc.cloud.entities.Mobilesms;
import com.itcc.cloud.service.MobilesmsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MobilesmsServiceImpl implements MobilesmsService {


    @Resource
    MobilesmsDao mobilesmsDao;
    @Override
    public void insertMobile( Mobilesms mobilesms) {
        mobilesmsDao.insertMobile(mobilesms);
    }
}
