# contracts · 跨语言契约源（Protobuf）

统一领域模型与域间 gRPC 契约的**唯一事实来源**（docs/architecture/00 §3）。Java（`pension-domain-commons` + 生成 stub）、Rust（prost/tonic）、Python（grpcio-tools）均由此生成。

## 目录

| 路径 | 内容 |
|------|------|
| `proto/common/v1` | `Money` / `RiskLevel` / `ProductRiskLevel` / `DomainEventEnvelope` |
| `proto/advisor/v1` | `Suitability.Check`（D5→D3 适当性控制）、`Quant`（D3 内部量化计算） |
| `proto/account/v1` | `Account.CheckQuota / GetBalance`（D5→D2 控制） |
| `proto/product/v1` | `Product.QueryCandidates / GetForTrade / BatchGetNav`（D3/D5→D4） |
| `proto/trade/v1` | `Trade.PlacePortfolioOrder / GetOrder` + 单向 `OrderStatus` 状态机 |

## 版本与兼容规则

- 目录带版本号（`v1`），破坏性变更必须新开 `v2`，禁止修改已发布字段编号
- 新增字段一律 optional 语义（proto3 默认），消费方需容忍未知字段
- 领域事件类型登记于 `EventTypes`（Java）并保持与 `common/v1/DomainEventEnvelope.event_type` 命名一致

## 生成（示例）

```bash
# Java: protobuf-maven-plugin; Rust: tonic-build (build.rs); Python:
python -m grpc_tools.protoc -I proto --python_out=. --grpc_python_out=. proto/advisor/v1/quant.proto
```
