package com.spring.aop.springaop.Business;

import com.spring.aop.springaop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomethings() {
        return dao2.retrieveSomething();
    }
}
