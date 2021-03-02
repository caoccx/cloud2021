package com.itcc.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mobilesms {
    private Long id;
    private String userId;
    private String mobile;
    private String billMonth;
    private String time;
    private String peerNumber;
    private String location;
    private String sendType;
    private String msgType;
    private String serviceName;
    private int fee;
    private Date createTime;
    private Date lastModifyTime;

    }
