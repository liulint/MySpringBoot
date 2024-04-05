package com.springboot;

import com.spring.MyApplicationContext;
import com.springboot.server.TomcatWebServer;
import com.springboot.server.WebServer;

/**
 * @Author: ly
 * @Package: com.springboot
 * @Project: mySpring
 * @name: SpringApplication
 * @Date:2024/1/28 22:34
 */
public class SpringApplication {
    public static void run(Class clazz){
        TomcatWebServer.startTomcat();
    }
}
