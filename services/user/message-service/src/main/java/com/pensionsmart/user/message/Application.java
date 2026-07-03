package com.pensionsmart.user.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D2 用户管理域 - message-service
 * 职责: 消息中心: 分类/偏好/免打扰/已读/存储查询
 * 功能点: D2.4-F1~F5 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/02_用户管理域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
