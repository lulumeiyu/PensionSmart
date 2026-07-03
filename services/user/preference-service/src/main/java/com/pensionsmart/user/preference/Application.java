package com.pensionsmart.user.preference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D2 用户管理域 - preference-service
 * 职责: 用户偏好: 投资/通知/界面偏好与聚合查询
 * 功能点: D2.5-F1~F4 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/02_用户管理域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
