# quant-compute（D3 · Python 量化计算服务）

- **职责**: MVO 均值方差优化 / Black-Litterman 修正 / 历史回测 / 压力测试 / 蒙特卡洛（`D3.2-F3~F4`、`D3.6-F1~F4`）
- **形态**: gRPC 服务（端口 9136），由 `allocation-svc` / `rebalance-svc` 调用
- **数据**: 净值/回测数据读 ClickHouse
- **降级契约**: 调用方超时回退到预置 TRF 静态权重（保证方案 P95 ≤ 3s）
- **架构**: `docs/architecture/03_投顾引擎域_模块设计V1.md`
