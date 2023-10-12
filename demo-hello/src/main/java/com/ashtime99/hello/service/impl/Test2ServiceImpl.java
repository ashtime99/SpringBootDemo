package com.ashtime99.hello.service.impl;

import com.ashtime99.hello.service.TestService;
import org.springframework.stereotype.Service;

/**
 * 实现类 2
 *
 * @author xiayichao
 * @version 1.0
 */
@Service
public class Test2ServiceImpl implements TestService {

    @Override
    public String sayHello() {
        return "test2 say hello";
    }

}
