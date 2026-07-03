package com.pensionsmart.content.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D6 内容教育域 - activity-svc
 * 职责: 活动运营: 配置/签到任务/组合PK/奖励结算
 * 功能点: D6.5-F1~F4 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/06_内容教育域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
