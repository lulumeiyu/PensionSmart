package com.pensionsmart.marketing.reach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D1 营销获客域 - reach-svc
 * 职责: 精准触达引擎: 触发匹配/渲染/投递/频控/效果回收
 * 功能点: D1.2-F1~F8 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/01_营销获客域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
