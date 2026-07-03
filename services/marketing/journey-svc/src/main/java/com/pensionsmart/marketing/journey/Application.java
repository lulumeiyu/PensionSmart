package com.pensionsmart.marketing.journey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D1 营销获客域 - journey-svc
 * 职责: 营销自动化工坊: 旅程编排/执行/跟踪/统计
 * 功能点: D1.3-F1~F4 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/01_营销获客域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
