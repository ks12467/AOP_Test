package com.standard.sparta.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/bean")
public class BeanController {

    private final ApplicationContext applicationContext;

    @GetMapping
    public void checkBeanAPI() {
        Object courseService = applicationContext.getBean("courseService");
        Class<?> aClass = courseService.getClass();
        log.info(aClass.getName());
    }
}
