package com.pensionsmart.product.compare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D4 产品中心域 - compare-svc
 * 职责: 产品对比: 清单/曲线叠加/费率风险对比/持有期模拟
 * 功能点: D4.4-F1~F5 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/04_产品中心域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
