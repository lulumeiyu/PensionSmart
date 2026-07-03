package com.pensionsmart.content.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D6 内容教育域 - learning-svc
 * 职责: 互动学习: 闯关/规划清单/进度
 * 功能点: D6.4-F1~F3 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/06_内容教育域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
