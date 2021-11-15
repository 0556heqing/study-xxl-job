package com.heqing.xxljob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author heqing
 * @date 2021/7/22 17:10
 */
@SpringBootApplication
@ServletComponentScan
public class XxlJobApplication {

    public static void main(String[] args) {
        new SpringApplication(XxlJobApplication.class).run(args);
    }

}
