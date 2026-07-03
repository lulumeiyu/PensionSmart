# platform-commons · 统一领域模型（Shared Kernel）

对应《系统架构设计总览 V1》§3。以 `contracts/proto` 为跨语言契约源：Java 侧使用本模块（`pension-domain-commons`），Rust/Python 侧由 proto 生成对应类型，保证语义一致。

| 包 | 内容 |
|----|------|
| `com.pensionsmart.commons.domain` | `Money`（Decimal 18,2 禁浮点）、`RiskLevel`(C1~C5)、`ProductRiskLevel`(R1~R5) |
| `com.pensionsmart.commons.event` | `DomainEvent` 统一事件信封、`EventTypes` 跨域事件目录 |
| `com.pensionsmart.commons.audit` | `AuditEvent` 不可篡改审计事件（哈希链） |

构建：`mvn -f platform-commons/pension-domain-commons/pom.xml install`（各业务服务依赖本 jar）。
