package com.ashtime99.hello.service.impl;

import com.ashtime99.hello.service.TestService;
import org.springframework.stereotype.Service;

/**
 * 实现类 1
 *
 * @author xiayichao
 * @version 1.0
 */
@Service
public class Test1ServiceImpl implements TestService {

    @Override
    public String sayHello() {
        return "test1 say hello";
    }
}
