package com.ashtime99.hello.controller;

import cn.hutool.core.util.StrUtil;
import com.ashtime99.hello.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiayichao
 * @version 1.0
 */
@Api(tags = "hello API")
@RestController
public class HelloController {

    @Resource(name = "test1ServiceImpl")
    private TestService testService;

    @GetMapping("/hello")
    @ApiOperation("打招呼")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}, {}!", who, "来一起学习SpringBoot吧");
    }

    @GetMapping("/test")
    public String sayHello() {
        return testService.sayHello();
    }
}
