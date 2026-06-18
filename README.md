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

Паттерны:

Gateway API

Service Discovery

Circuit Breaker

External Configuration
