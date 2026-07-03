package com.pensionsmart.product.aiinterpret;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D4 产品中心域 - ai-interpret-svc
 * 职责: AI 产品解读: 通俗解读/问答/个性化适配
 * 功能点: D4.5-F1~F3 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/04_产品中心域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
