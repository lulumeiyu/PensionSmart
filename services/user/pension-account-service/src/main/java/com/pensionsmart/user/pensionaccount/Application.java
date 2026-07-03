package com.pensionsmart.user.pensionaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D2 用户管理域 - pension-account-service
 * 职责: 养老金账户: 开户/状态/余额/额度/拦截/归集
 * 功能点: D2.2-F1~F6 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/02_用户管理域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
