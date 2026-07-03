# catalog-svc

- **所属域**: D4 产品中心域
- **职责**: 产品货架: 上下架/排序/筛选/推荐位/个性化排序
- **功能点**: `D4.2-F1~F5`（详见《模块功能职责分解 V1》）
- **架构设计**: `docs/architecture/04_产品中心域_模块设计V1.md`
- **端口**: 8142

## 分层（DDD 六边形）

```
src/main/java/com/pensionsmart/product/catalog/
├─ interfaces/       # 接口适配层: REST Controller / gRPC / MQ Consumer
├─ application/      # 应用层: 用例编排 / 事务边界
├─ domain/           # 领域层: 聚合 / 领域服务 / 领域事件（纯逻辑, 不依赖框架）
└─ infrastructure/   # 基础设施层: PG Repo / Redis / 外部适配器 / MQ Publisher
```
