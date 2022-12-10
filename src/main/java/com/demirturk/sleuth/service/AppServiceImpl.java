package com.demirturk.sleuth.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AppServiceImpl implements AppService {

    @Override
    public String get() {
        log.info("appServiceImpl Get");
        return "getting the value";
    }
}
