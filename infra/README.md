# S2 基础平台域（`infra-platform`）

架构设计: `docs/architecture/08_基础平台域_模块设计V1.md`

| 目录 | 职责 | 功能点 |
|------|------|--------|
| `gateway/` | API 网关: 鉴权/限流/路由/访问日志 | `S2.1-F1~F4` |
| `config/` | 配置中心 (Nacos): 存储/热更新/版本回滚 | `S2.2-F1~F3` |
| `observability/` | Prometheus/Grafana/ELK/SkyWalking | `S2.3-F1~F5` |
| `security/` | 加密/HSM 密钥/AML/访问审计（强合规区） | `S2.4-F1~F5` |
| `cicd/` | 流水线模板/镜像构建规范 | `S2.5-F1~F2` |
| `deploy/` | docker-compose(本地) / K8s(kustomize) / ArgoCD | `S2.5-F3~F5` |
