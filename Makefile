# PensionSmart · 工程构建入口 (对应 docs/architecture/00)

JAVA_DOMAINS := marketing user advisor product content

.PHONY: help dev-up dev-down build-commons build-java build-trade build-frontend proto-lint

help:
	@echo "make dev-up          启动本地开发中间件 (PG/Redis/CK/Nacos/Kafka/RocketMQ)"
	@echo "make build-commons   构建统一领域模型 jar (pension-domain-commons)"
	@echo "make build-java      构建全部 Java 域服务 (D1/D2/D3/D4/D6)"
	@echo "make build-trade     构建 Rust 交易域 (D5)"
	@echo "make build-frontend  构建前端 web-app + bff"
	@echo "make proto-lint      校验 proto 契约语法"

dev-up:
	docker compose -f infra/deploy/docker-compose.yml up -d

dev-down:
	docker compose -f infra/deploy/docker-compose.yml down

build-commons:
	mvn -f platform-commons/pension-domain-commons/pom.xml install -q

build-java: build-commons
	@for d in $(JAVA_DOMAINS); do \
		echo "==> services/$$d"; \
		mvn -f services/$$d/pom.xml package -q -DskipTests; \
	done

build-trade:
	cargo build --workspace --manifest-path services/trade/Cargo.toml

build-frontend:
	cd frontend/web-app && npm install && npm run build
	cd frontend/bff && npm install && npm run build

proto-lint:
	@command -v protoc >/dev/null || { echo "protoc not installed"; exit 1; }
	@cd contracts && for f in $$(find proto -name '*.proto'); do \
		protoc -I proto --descriptor_set_out=/dev/null $$f && echo "OK $$f"; \
	done
