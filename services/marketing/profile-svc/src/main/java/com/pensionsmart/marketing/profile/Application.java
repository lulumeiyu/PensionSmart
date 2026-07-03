package com.pensionsmart.marketing.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D1 营销获客域 - profile-svc
 * 职责: 用户画像与标签: 标签计算/查询/元数据
 * 功能点: D1.1-F1~F6 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/01_营销获客域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
