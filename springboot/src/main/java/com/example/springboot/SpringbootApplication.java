package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println("=============================项目启动成功==========================");
        System.err.println("B站关注：程序员青戈，手把手带你做毕设！毕设、课设项目定制加up微信：xia_qing2012。代码纯手撸，安全靠谱！");
    }

    // 健康检查的接口
    @GetMapping
    public String health() {
        return "SUCCESS";
    }
}
