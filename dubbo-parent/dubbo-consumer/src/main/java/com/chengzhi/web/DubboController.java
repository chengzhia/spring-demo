package com.chengzhi.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chengzhi.web.service.DubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xebest on 2018/1/4.
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {

//    @Resource
    @Reference(version = "1.0.0")
    DubboService dubboService;

    @RequestMapping("sayHello")
    public void sayHello() {
        System.out.println("dubbo开始调用");
        dubboService.sayHello("consumer 请求服务");
    }


}
