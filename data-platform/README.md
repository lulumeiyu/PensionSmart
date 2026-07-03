# S1 数据中台域（`data-platform`）

架构设计: `docs/architecture/07_数据中台域_模块设计V1.md`。Lambda 架构: 实时(Flink) + 离线(Spark), 数仓 ClickHouse, 管道 Kafka。

| 目录 | 职责 | 功能点 |
|------|------|--------|
| `collect/` | 多端埋点 SDK、上报接收、清洗 | `S1.1-F1~F3` |
| `realtime-flink/` | 实时流处理、实时标签、实时指标、行情波动监测 | `S1.2-F1~F3` |
| `offline-spark/` | T+1 批调度、画像批更、报表 | `S1.3-F1~F3` |
| `warehouse-clickhouse/` | ODS/DWD/DWS/ADS 分层建模、OLAP、BI | `S1.4-F1~F3` |
| `governance/` | 质量监控、元数据、血缘、安全审计 | `S1.5-F1~F4` |
