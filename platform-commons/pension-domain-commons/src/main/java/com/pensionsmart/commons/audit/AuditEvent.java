package com.pensionsmart.commons.audit;

import java.time.Instant;

/**
 * 不可篡改审计事件（哈希链）, 关键交易与合规事件必须写入（v1.1 §6.4）。
 * 保留 >= 20 年, 冷热分层存储。
 *
 * @param auditId      审计记录 ID
 * @param actor        操作者（用户/系统/运营）
 * @param action       动作, 如 TRADE_PLACED / KYC_UPDATED / SUITABILITY_DECISION
 * @param resource     资源标识, 如订单号/账户号
 * @param occurredAt   发生时间
 * @param traceId      链路 ID
 * @param prevHash     前一条审计记录哈希（链式防篡改）
 * @param contentHash  本条内容哈希
 */
public record AuditEvent(
        String auditId,
        String actor,
        String action,
        String resource,
        Instant occurredAt,
        String traceId,
        String prevHash,
        String contentHash) {
}
