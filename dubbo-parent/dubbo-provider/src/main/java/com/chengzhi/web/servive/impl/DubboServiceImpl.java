package com.chengzhi.web.servive.impl;

import com.chengzhi.web.service.DubboService;
import org.springframework.stereotype.Service;

/**
 * Created by xebest on 2018/1/4.
 */
@Service
public class DubboServiceImpl implements DubboService{
    @Override
    public void sayHello(String name) {
        System.out.println("---dubbo 发布服务----");
    }
}
