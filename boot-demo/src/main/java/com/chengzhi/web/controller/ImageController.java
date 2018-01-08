package com.chengzhi.web.controller;

import com.chengzhi.properties.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIPTION}
 *
 * @param
 * @author RCZ
 * @create 2017-12-31 14:50
 */
@RestController
@RequestMapping("query")
public class ImageController {

    @Resource
    private Users users;

    @RequestMapping("query")
    public String queryImage(HttpServletRequest request) {
        System.out.println(request.getContextPath());
        System.out.println(request.getServletPath());
        System.out.println(request.getRequestURI());
        return "hello world";
    }
    @RequestMapping("print")
    public void printTest() {
        System.out.println(users.getName()+users.getPassword());
    }
}
