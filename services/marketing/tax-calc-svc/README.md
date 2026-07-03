# tax-calc-svc

- **所属域**: D1 营销获客域
- **职责**: 税优计算器: 计算/H5/分享/邀请码/注册引导
- **功能点**: `D1.6-F1~F6`（详见《模块功能职责分解 V1》）
- **架构设计**: `docs/architecture/01_营销获客域_模块设计V1.md`
- **端口**: 8115

## 分层（DDD 六边形）

```
src/main/java/com/pensionsmart/marketing/taxcalc/
├─ interfaces/       # 接口适配层: REST Controller / gRPC / MQ Consumer
├─ application/      # 应用层: 用例编排 / 事务边界
├─ domain/           # 领域层: 聚合 / 领域服务 / 领域事件（纯逻辑, 不依赖框架）
└─ infrastructure/   # 基础设施层: PG Repo / Redis / 外部适配器 / MQ Publisher
```
