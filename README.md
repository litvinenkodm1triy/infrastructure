Infrastructure — Spring Cloud микросервисная инфраструктура
Назначение:
Проект предоставляет базовую инфраструктуру для микросервисного приложения на основе Spring Cloud. Включает в себя:

Service Discovery — Eureka Server для регистрации и обнаружения сервисов.

External Configuration — Config Server с Git-репозиторием для централизованного управления конфигурациями.

API Gateway — маршрутизация запросов, балансировка нагрузки и Circuit Breaker (Resilience4j).

Circuit Breaker — защита от каскадных отказов с помощью Resilience4j.

Технологический стек:

Java 17

Spring Boot 3.4.5

Spring Cloud 2024.0.0

Netflix Eureka

Spring Cloud Config

Spring Cloud Gateway

Resilience4j

Docker / Docker Compose

Паттерны (задание):

Gateway API

Service Discovery

Circuit Breaker

External Configuration

Быстрый запуск:

bash
docker-compose up -d
Сервисы:

Компонент	Порт	URL
Eureka Server	8761	http://localhost:8761
Config Server	8888	http://localhost:8888
API Gateway	8080	http://localhost:8080
Notification Service	8082	http://localhost:8082
Проверка работы:

bash
# Проверить состояние Circuit Breaker
curl http://localhost:8082/actuator/circuitbreakers

# Отправить уведомление через Gateway
curl -X POST http://localhost:8080/api/v1/notifications/send \
  -H "Content-Type: application/json" \
  -d '{"email":"test@example.com","operation":"CREATE"}'
Структура репозитория:

text
infrastructure/
├── eureka-server/          # Service Discovery
├── config-server/          # External Configuration
├── api-gateway/            # API Gateway + Circuit Breaker
├── config-repo/            # Конфигурационные файлы
└── docker-compose.yml      # Запуск всех сервисов
