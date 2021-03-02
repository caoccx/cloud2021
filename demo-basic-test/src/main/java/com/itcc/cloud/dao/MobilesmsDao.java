package com.itcc.cloud.dao;

import com.itcc.cloud.entities.Mobilesms;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by caocaixia on 2021/3/2 13:21
 */
@Mapper
public interface MobilesmsDao {
    void insertMobile(Mobilesms mobilesms);
}
