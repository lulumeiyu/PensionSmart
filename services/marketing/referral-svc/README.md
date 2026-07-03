# referral-svc

- **所属域**: D1 营销获客域
- **职责**: 社交裂变: 邀请关系/任务/归因/发奖
- **功能点**: `D1.5-F1~F4`（详见《模块功能职责分解 V1》）
- **架构设计**: `docs/architecture/01_营销获客域_模块设计V1.md`
- **端口**: 8116

## 分层（DDD 六边形）

```
src/main/java/com/pensionsmart/marketing/referral/
├─ interfaces/       # 接口适配层: REST Controller / gRPC / MQ Consumer
├─ application/      # 应用层: 用例编排 / 事务边界
├─ domain/           # 领域层: 聚合 / 领域服务 / 领域事件（纯逻辑, 不依赖框架）
└─ infrastructure/   # 基础设施层: PG Repo / Redis / 外部适配器 / MQ Publisher
```
