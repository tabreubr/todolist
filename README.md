# 📋 TodoList API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23C1272D?style=for-the-badge&logo=swagger&logoColor=white)

> **Status do Projeto:** 🚀 Finalizado / Desafio Técnico Júnior

Esta é uma API REST robusta para gerenciamento de tarefas, desenvolvida para demonstrar boas práticas em **Java 21** e **Spring Boot**. O sistema permite o controle total de atividades com um diferencial de **ordenagem inteligente** baseada em prioridades.

---

## ✨ Funcionalidades

* ✅ **CRUD Completo**: Criar, listar, atualizar e remover tarefas.
* ⚖️ **Priorização**: Tarefas classificadas em ALTA, MEDIA e BAIXA.
* 🔍 **Ordenação Automática**: Listagem organizada por prioridade (descendente) e nome (ascendente).
* 🛡️ **Validação**: Proteção contra dados nulos ou vazios usando Bean Validation.
* 🐳 **Pronto para Docker**: Ambiente completo (App + DB + Admin) configurado.
* 📖 **Documentação**: Interface Swagger interativa para testes de API.

---

## 🚀 Tecnologias Utilizadas

| Ferramenta | Descrição |
| :--- | :--- |
| **Java 21** | Linguagem de programação com recursos modernos (LTS). |
| **Spring Boot 3.5.9** | Framework para agilidade no desenvolvimento backend. |
| **Spring Data JPA** | Facilitação da persistência e consultas ao banco. |
| **PostgreSQL** | Banco de dados relacional para persistência segura. |
| **Docker & Compose** | Containerização de toda a infraestrutura. |
| **Lombok** | Produtividade através da redução de boilerplate. |
| **H2 Database** | Banco em memória para velocidade na execução de testes. |

---

## 🧠 Arquitetura do Projeto

A aplicação segue uma estrutura modular e limpa, garantindo separação de responsabilidades:



1.  **Camada de Controle (`Controller`)**: Gerencia os endpoints REST e valida as entradas.
2.  **Camada de Serviço (`Service`)**: Onde reside a regra de negócio e a lógica de ordenação customizada.
3.  **Camada de Persistência (`Repository`)**: Interface JpaRepository para comunicação com o Postgres.
4.  **Modelo de Domínio (`Entities`)**: Definição da estrutura da tabela e regras de integridade.
