package com.ashtime99.helloworld;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * SpringBoot 启动类
 * </p>
 *
 * @author ash
 * @version 1.0
 * @since 2021/5/17 14:32
 */
@SpringBootApplication
@RestController
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class,args);
    }

    /**
     * HelloWorld
     *
     * @param who 谁
     * @return java.lang.String
     * @author ash
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}, {}!", who,"来一起学习SpringBoot吧");
    }
}
