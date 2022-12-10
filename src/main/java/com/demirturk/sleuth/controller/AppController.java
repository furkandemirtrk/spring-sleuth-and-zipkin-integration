package com.demirturk.sleuth.controller;

import com.demirturk.sleuth.aspect.annotations.Logger;
import com.demirturk.sleuth.service.AppService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class AppController {

    private final AppService appService;

    @Logger
    @GetMapping
    public ResponseEntity<String> get(
            @RequestHeader(name = "id") Long id
    ){
        String val = appService.get();
        log.info(val  + "   :   " + id);
        return ResponseEntity.ok(val);
    }
}
