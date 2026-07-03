"""gRPC 服务入口: Quant.Optimize / Quant.Backtest。

架构: docs/architecture/03_投顾引擎域_模块设计V1.md
契约: contracts/proto/advisor/v1/quant.proto
部署: CPU 密集型独立节点池, 与在线服务隔离; 超时由调用方(allocation-svc)降级到静态 TRF 权重。
"""

GRPC_PORT = 9136


def main() -> None:
    # TODO: 从 contracts/proto 生成 stub 后注册 QuantServicer 并启动 grpc.server
    print(f"quant-compute scaffold, gRPC port {GRPC_PORT}")


if __name__ == "__main__":
    main()
