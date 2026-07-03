package com.pensionsmart.product.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D4 产品中心域 - rating-svc
 * 职责: 产品评分: 定量/定性/综合评分/展示
 * 功能点: D4.6-F1~F4 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/04_产品中心域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
