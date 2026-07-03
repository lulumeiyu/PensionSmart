# pension-account-service

- **所属域**: D2 用户管理域
- **职责**: 养老金账户: 开户/状态/余额/额度/拦截/归集
- **功能点**: `D2.2-F1~F6`（详见《模块功能职责分解 V1》）
- **架构设计**: `docs/architecture/02_用户管理域_模块设计V1.md`
- **端口**: 8122

## 分层（DDD 六边形）

```
src/main/java/com/pensionsmart/user/pensionaccount/
├─ interfaces/       # 接口适配层: REST Controller / gRPC / MQ Consumer
├─ application/      # 应用层: 用例编排 / 事务边界
├─ domain/           # 领域层: 聚合 / 领域服务 / 领域事件（纯逻辑, 不依赖框架）
└─ infrastructure/   # 基础设施层: PG Repo / Redis / 外部适配器 / MQ Publisher
```
