package com.pensionsmart.product.ingest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D4 产品中心域 - ingest-svc
 * 职责: 产品接入标准化: 基金/理财/保险接入/净值持仓同步/质量校验
 * 功能点: D4.1-F1~F7 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/04_产品中心域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
