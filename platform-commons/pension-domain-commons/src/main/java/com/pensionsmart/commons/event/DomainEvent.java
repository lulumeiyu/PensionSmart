package com.pensionsmart.commons.event;

import java.time.Instant;
import java.util.UUID;

/**
 * 领域事件统一信封（docs/architecture/00 §3.2）。
 * 经 Outbox 投递至 RocketMQ, traceId 贯穿 REST/gRPC/事件全链路。
 *
 * @param eventId    全局唯一事件 ID
 * @param eventType  事件类型, 如 trade.FirstPurchaseCompleted
 * @param occurredAt 业务发生时间
 * @param source     生产者模块, 如 trade-module
 * @param traceId    链路追踪 ID
 * @param version    契约版本
 * @param payload    业务载荷（JSON 序列化）
 */
public record DomainEvent<T>(
        String eventId,
        String eventType,
        Instant occurredAt,
        String source,
        String traceId,
        String version,
        T payload) {

    public static <T> DomainEvent<T> of(String eventType, String source, String traceId, T payload) {
        return new DomainEvent<>(
                "evt_" + UUID.randomUUID(),
                eventType,
                Instant.now(),
                source,
                traceId,
                "1.0",
                payload);
    }
}
