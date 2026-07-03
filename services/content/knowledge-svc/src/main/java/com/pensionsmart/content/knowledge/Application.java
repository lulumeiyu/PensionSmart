package com.pensionsmart.content.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * D6 内容教育域 - knowledge-svc
 * 职责: 知识库: 分层组织/个性化推荐/阅读埋点
 * 功能点: D6.1-F1~F3 (见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md)
 * 架构: docs/architecture/06_内容教育域_模块设计V1.md
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
