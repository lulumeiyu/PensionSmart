# activity-svc

- **所属域**: D6 内容教育域
- **职责**: 活动运营: 配置/签到任务/组合PK/奖励结算
- **功能点**: `D6.5-F1~F4`（详见《模块功能职责分解 V1》）
- **架构设计**: `docs/architecture/06_内容教育域_模块设计V1.md`
- **端口**: 8165

## 分层（DDD 六边形）

```
src/main/java/com/pensionsmart/content/activity/
├─ interfaces/       # 接口适配层: REST Controller / gRPC / MQ Consumer
├─ application/      # 应用层: 用例编排 / 事务边界
├─ domain/           # 领域层: 聚合 / 领域服务 / 领域事件（纯逻辑, 不依赖框架）
└─ infrastructure/   # 基础设施层: PG Repo / Redis / 外部适配器 / MQ Publisher
```
