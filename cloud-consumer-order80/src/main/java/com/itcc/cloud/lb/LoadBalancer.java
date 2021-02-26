package com.itcc.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by caocaixia on 2021/2/26 19:22
 * 轮载接口，从eureka上收集活得机器总数
 */
@Component
public interface LoadBalancer {
    //容器加载的时候，获得Eureka服务上有多少活得机器
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
