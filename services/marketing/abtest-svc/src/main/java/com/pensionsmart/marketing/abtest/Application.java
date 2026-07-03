package com.pensionsmart.marketing.abtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D1 营销获客域 - abtest-svc
 * 职责: A/B 实验平台: 配置/分流/采集/显著性
 * 功能点: D1.4-F1~F4 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/01_营销获客域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
