package com.pensionsmart.advisor.risk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D3 投顾引擎域 - risk-svc
 * 职责: 风险测评: 评分/等级合成/有效期/适当性校验/留痕
 * 功能点: D3.1-F1~F7 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/03_投顾引擎域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
