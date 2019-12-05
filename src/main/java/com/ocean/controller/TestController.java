/*
package com.ocean.controller;


import com.alibaba.dubbo.config.annotation.Reference;


import com.qsltest.springboot.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/dubbo"})
public class TestController {

    @Reference(version = "3.0.0",check = true)
    private TestService testService;

    @RequestMapping(value = {"/test"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public String getName() {
        int i = 0;
        return testService.testDubbo();
    }
}
*/
