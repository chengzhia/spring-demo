package com.chengzhi.web.servive.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chengzhi.web.service.DubboService;

/**
 * Created by xebest on 2018/1/4.
 */
@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService{
    @Override
    public void sayHello(String name) {
        System.out.println(name);
        System.out.println("---dubbo 发布服务----");
    }
}
