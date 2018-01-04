package com.chengzhi.web;


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

    @Resource
    private DubboService dubboService;

    @RequestMapping("sayHello")
    public void sayHello() {
        dubboService.sayHello("consumer 请求服务");
    }


}
