package com.pensionsmart.product.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D4 产品中心域 - catalog-svc
 * 职责: 产品货架: 上下架/排序/筛选/推荐位/个性化排序
 * 功能点: D4.2-F1~F5 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/04_产品中心域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
