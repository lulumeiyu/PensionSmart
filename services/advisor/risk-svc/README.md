# risk-svc

- **所属域**: D3 投顾引擎域
- **职责**: 风险测评: 评分/等级合成/有效期/适当性校验/留痕
- **功能点**: `D3.1-F1~F7`（详见《模块功能职责分解 V1》）
- **架构设计**: `docs/architecture/03_投顾引擎域_模块设计V1.md`
- **端口**: 8131

## 分层（DDD 六边形）

```
src/main/java/com/pensionsmart/advisor/risk/
├─ interfaces/       # 接口适配层: REST Controller / gRPC / MQ Consumer
├─ application/      # 应用层: 用例编排 / 事务边界
├─ domain/           # 领域层: 聚合 / 领域服务 / 领域事件（纯逻辑, 不依赖框架）
└─ infrastructure/   # 基础设施层: PG Repo / Redis / 外部适配器 / MQ Publisher
```
