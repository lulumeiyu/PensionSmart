package com.pensionsmart.user.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D2 用户管理域 - user-service
 * 职责: 注册/验证码/实名/人脸/KYC/登录/注销
 * 功能点: D2.1-F1~F7 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/02_用户管理域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
