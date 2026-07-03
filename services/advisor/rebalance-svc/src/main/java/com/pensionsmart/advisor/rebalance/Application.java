package com.pensionsmart.advisor.rebalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D3 投顾引擎域 - rebalance-svc
 * 职责: 动态再平衡: 偏离检测/建议/调仓计算/执行编排
 * 功能点: D3.4-F1~F5 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/03_投顾引擎域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
