package com.pensionsmart.advisor.behavior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D3 投顾引擎域 - behavior-svc
 * 职责: 行为金融修正: 行为识别/稳健性调整/反脆弱提示
 * 功能点: D3.5-F1~F3 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/03_投顾引擎域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
