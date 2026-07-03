-- ODS 贴源层: 全端埋点事件 (Kafka 引擎表 + 物化落地示例)
CREATE TABLE IF NOT EXISTS ods.ods_events
(
    event_id     String,
    event_type   LowCardinality(String),
    user_id      String,
    occurred_at  DateTime64(3, 'Asia/Shanghai'),
    trace_id     String,
    payload      String  -- JSON
)
ENGINE = MergeTree
PARTITION BY toYYYYMMDD(occurred_at)
ORDER BY (event_type, occurred_at, user_id)
TTL toDateTime(occurred_at) + INTERVAL 3 YEAR;
