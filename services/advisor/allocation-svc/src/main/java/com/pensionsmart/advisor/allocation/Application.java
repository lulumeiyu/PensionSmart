package com.pensionsmart.advisor.allocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D3 投顾引擎域 - allocation-svc
 * 职责: 资产配置: TRF/TDF/约束校验/权重生成(调quant)
 * 功能点: D3.2-F1~F6 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/03_投顾引擎域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
