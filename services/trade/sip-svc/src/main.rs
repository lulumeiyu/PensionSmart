//! D5 交易结算域 · sip-svc
//!
//! 职责: 智能定投: 定额/不定额/目标定投、计划管理、失败重试
//! 功能点: D5.3-F1~F5（见 docs/个人养老金智能投顾平台_模块功能职责分解V1.md）
//! 架构: docs/architecture/05_交易结算域_模块设计V1.md
//! 端口: 8153 (REST) / 9153 (gRPC)
//!
//! 分层 (六边形):
//! - interfaces/       axum REST / tonic gRPC / MQ 消费
//! - application/      Saga 编排 / 幂等 / 用例服务
//! - domain/           Order 聚合 / 状态机 / 拆单规则 / 补偿策略（纯逻辑）
//! - infrastructure/   sqlx(PG) / Redis / 通道适配器 / Outbox / gRPC 客户端

mod application;
mod domain;
mod infrastructure;
mod interfaces;

fn main() {
    // TODO: tracing 初始化 -> 配置加载(Nacos) -> PG/Redis 连接 -> axum + tonic 启动
    println!("sip-svc scaffold - see docs/architecture/05");
}
