package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: Akriar
 * @CreateDate: 2020/5/21 - 20:37
 */

@MapperScan("com.leyou.item.mapper")//扫描mapper
@EnableDiscoveryClient//eureka客户端
@SpringBootApplication
public class LyItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class, args);
    }
}
