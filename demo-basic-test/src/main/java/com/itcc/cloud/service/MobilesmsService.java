package com.itcc.cloud.service;

import com.itcc.cloud.entities.Mobilesms;
import org.springframework.stereotype.Service;

@Service
public interface MobilesmsService {
    void insertMobile(Mobilesms mobilesms);
}
