# PensionSmart · 个人养老金智能投顾平台

## Requirements Docs

- 高阶需求说明书 v1.0（项目背景/用户分析/业务域分解/关联关系/功能分解/BP/验收标准）：`docs/pension-hrs-v1.0.md`
- 业务模块多维度分析 V1（多维度评分 + 模块间功能依赖关系 mermaid）：`docs/个人养老金智能投顾平台_业务模块多维度分析V1.md`
- 模块功能职责分解 V1（各模块功能穷举，符合单一职责原则）：`docs/个人养老金智能投顾平台_模块功能职责分解V1.md`
- 系统架构设计 V1（总览 + 8 域模块设计，功能设计/非功能设计，含 mermaid）：`docs/architecture/`
  - `00_系统架构设计总览V1.md`（总体架构/统一领域模型/非功能/部署/关键流程）
  - `01`~`08` 各业务域模块设计（系统模块/组件/接口/分层/部署/进程）
- 落地增强版（可开工）v1.1：`docs/pension-prd-executable-v1.1.md`
- **详细设计规范 V1**：`docs/详细设计规范V1.md`（10 章结构/接口/数据/流程/错误码/一致性/安全/测试规范）
  - 模板：`docs/detailed-design/_TEMPLATE_详细设计.md`；产出位置：`docs/detailed-design/<domain>/<service>_详细设计V<n>.md`
  - AI 协作资产：skill `.cursor/skills/detailed-design/` + rules `.cursor/rules/`（写设计文档与写代码时自动应用）

## 工程目录结构（对应架构设计 00~08）

```
.
├─ contracts/                    # 跨语言契约源 (Protobuf): common/advisor/account/product/trade
├─ frontend/                     # 前后端分离
│  ├─ web-app/                   #   React 18 + TS + Vite (Web/H5, src/features 按业务域组织)
│  └─ bff/                       #   NestJS BFF 聚合层 (前端唯一入口, 端口 3100)
├─ platform-commons/
│  └─ pension-domain-commons/    # 统一领域模型 Shared Kernel (Money/RiskLevel/DomainEvent/AuditEvent)
├─ services/                     # 业务域 = 独立系统模块
│  ├─ marketing/                 # D1 营销获客域 (Java, 8111~8116): profile/reach/journey/abtest/tax-calc/referral
│  ├─ user/                      # D2 用户管理域 (Java, 8121~8125, 强合规区): user/pension-account/member/message/preference
│  ├─ advisor/                   # D3 投顾引擎域 (Java, 8131~8135): risk/allocation/recommend/rebalance/behavior
│  │  └─ quant-compute/          #   Python 量化计算 gRPC (9136): MVO/BL/回测/压测/蒙特卡洛
│  ├─ product/                   # D4 产品中心域 (Java, 8141~8146): ingest/catalog/detail/compare/ai-interpret/rating
│  ├─ trade/                     # D5 交易结算域 (Rust workspace, 8151~8156, 强合规区):
│  │                             #   trade/redeem/sip/convert/settlement-recon/trade-risk
│  └─ content/                   # D6 内容教育域 (Java, 8161~8165): knowledge/simulator/cms/learning/activity
├─ data-platform/                # S1 数据中台域: collect / realtime-flink / offline-spark / warehouse-clickhouse / governance
├─ infra/                        # S2 基础平台域
│  ├─ gateway/                   #   API 网关路由 (鉴权/限流/路由)
│  ├─ config/                    #   Nacos 配置中心
│  ├─ observability/             #   Prometheus/Grafana/ELK/SkyWalking (含 P0 资金告警规则)
│  ├─ security/                  #   KMS/AML/审计 (强合规区)
│  ├─ cicd/                      #   流水线模板
│  └─ deploy/                    #   docker-compose(本地) / k8s(命名空间+网络策略+kustomize) / argocd
├─ docs/                         # 需求与架构文档
└─ Makefile                      # dev-up / build-commons / build-java / build-trade / build-frontend / proto-lint
```

### 约定

- **每个 Java 服务**统一 DDD 六边形分层：`interfaces / application / domain / infrastructure`（Rust 同构，为 `src/*.rs` 模块）。
- **域间通信**：同步 gRPC（契约在 `contracts/proto`）、异步 RocketMQ 领域事件（类型登记于 `EventTypes`）、数据管道 Kafka → ClickHouse。
- **强合规隔离区**：`user`、`trade`、`infra/security` 部署于独立节点池/VPC（`infra/deploy/k8s/namespaces.yaml` 中 `zone: secure`）。
- **本地开发**：`make dev-up` 启动 PG/Redis/ClickHouse/Nacos/Kafka/RocketMQ。

## 快速开始

```bash
make dev-up            # 本地中间件
make build-commons     # 统一领域模型 jar
make build-java        # D1/D2/D3/D4/D6 Java 服务
make build-trade       # D5 Rust 交易域
make build-frontend    # React + BFF
```
