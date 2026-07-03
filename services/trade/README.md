# D5 交易结算域（`trade-module`, Rust）

**零容错金融核心 · 强合规隔离区**。架构设计: `docs/architecture/05_交易结算域_模块设计V1.md`

技术栈: Rust (axum + tokio + sqlx + tonic)；PG(订单强一致) + Redis(幂等/锁/限流)；Outbox -> RocketMQ。

| 服务(crate) | 端口 | 职责 | 功能点 |
|------|------|------|--------|
| `trade-svc` | 8151 | 申购交易: 单笔/组合申购、拆单、Saga 编排、大额验证、状态查询 | `D5.1-F1~F6` |
| `redeem-svc` | 8152 | 赎回交易: 部分/全部赎回、到账预估、冷静期、状态 | `D5.2-F1~F5` |
| `sip-svc` | 8153 | 智能定投: 定额/不定额/目标定投、计划管理、失败重试 | `D5.3-F1~F5` |
| `convert-svc` | 8154 | 产品转换: 资格校验、转换下单、状态跟踪 | `D5.4-F1~F3` |
| `settlement-recon-svc` | 8155 | 清算对账: T+1 清算、逐笔对账、差异告警、审计留痕 | `D5.5-F1~F4` |
| `trade-risk-svc` | 8156 | 交易风控: 异常识别、实时拦截、人工工单、规则管理 | `D5.6-F1~F4` |

构建: `cargo build --workspace`（本目录）。
