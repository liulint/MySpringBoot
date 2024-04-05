package com.springboot.annotation;

import com.spring.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: ly
 * @Package: com.springboot.annotation
 * @Project: mySpring
 * @name: SpringBootApplication
 * @Date:2024/1/28 22:30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ComponentScan
public @interface SpringBootApplication {
}
