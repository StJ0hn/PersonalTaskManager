# 📌 Personal Task Manager – Java 21 (Gradle)

Um gerenciador pessoal de tarefas desenvolvido em Java 21 com Gradle, projetado para evoluir progressivamente conforme diferentes tópicos da linguagem são estudados. Cada etapa adiciona novas funcionalidades, permitindo uma revisão prática e estruturada.

> **Nota:** Algumas pastas e arquivos do projeto são *placeholders* para fases futuras. A Fase 1 utiliza apenas o repositório em memória e o CLI básico.

## 🎯 Objetivo

Construir um sistema organizado e escalável enquanto revisa os pilares da linguagem, incluindo fundamentos, POO, coleções, generics, exceções, I/O, Streams, concorrência, SOLID, testes e mais.

## 🚀 Funcionalidades (em expansão)

* CRUD básico de tarefas
* Classificação por prioridade, categorias e datas
* Persistência em arquivo
* Relatórios usando Streams
* Serviços assíncronos
* Arquitetura orientada a boas práticas
* Testes com JUnit

## 🛠️ Tecnologias

* Java 21
* Gradle
* JUnit 5

## 📂 Estrutura Inicial

```
src/
├── main/java/
└── test/java/
```

---

# 📌 Personal Task Manager — Checklist de Fases

A seguir estão todas as fases do projeto, cada uma com descrição, objetivo, entrega e estrutura prevista. O **status** será atualizado conforme o avanço.

---

## **Fase 1 — Núcleo do Sistema**

**Status:** *Pendente*
**Objetivo:** Criar a base funcional mínima.
**Entrega:** v1.0.0

### Funcionalidades

* Criar, editar, listar e excluir tarefas
* Cada tarefa contém:

  * título
  * descrição
  * data de criação
  * status (PENDENTE, EM_ANDAMENTO, CONCLUIDA)

### Arquitetura

* Camadas: **domain → application → infra → interfaces**
* Repositório em memória
* CLI simples para interação

### Estrutura de Diretórios

```
/domain
  Task.java
  Priority.java
  Category.java
  TaskStatus.java
/application
  /services
    CreateTaskService.java
    UpdateTaskService.java
    SearchTaskService.java
  /ports
    TaskRepository.java
/infra
  /memory
    InMemoryTaskRepository.java
  /db
    SqlTaskRepository.java   (placeholder)
  /serialization
    JsonTaskExporter.java    (placeholder)
/interfaces
  /cli
    MainCLI.java
  /rest
    TaskController.java      (placeholder)
```

---

## **Fase 2 — Sistema de Categorias e Prioridades**

**Status:** *Pendente*
**Objetivo:** Expandir a modelagem.
**Entrega:** v1.1.0

### Implementações

* Categorias nas tarefas
* Níveis de prioridade
* Ajustes nos serviços

---

## **Fase 3 — Persistência em Arquivo (JSON)**

**Status:** *Pendente*
**Objetivo:** Permitir salvar e carregar tarefas.
**Entrega:** v1.2.0

### Implementações

* Serialização
* Importação/exportação automática

---

## **Fase 4 — Relatórios**

**Status:** *Pendente*
**Objetivo:** Gerar visualizações e exportações.
**Entrega:** v1.3.0

---

## **Fase 5 — CLI Profissional**

**Status:** *Pendente*
**Objetivo:** Melhor experiência no terminal.
**Entrega:** v1.4.0

---

## **Fase 6 — Banco de Dados SQL (H2)**

**Status:** *Pendente*
**Objetivo:** Evoluir a persistência.
**Entrega:** v2.0.0

---

## **Fase 7 — API REST Completa**

**Status:** *Pendente*
**Objetivo:** Transformar o sistema em um backend real.
**Entrega:** v3.0.0

---

## **Fase 8 — Frontend Web (HTML/CSS/JS)**

**Status:** *Pendente*
**Objetivo:** Criar interface visual simples.
**Entrega:** v3.1.0

---

## **Fase 9 — Deploy + Portfólio**

**Status:** *Pendente*
**Objetivo:** Disponibilizar ao público e documentar.
**Entrega:** v4.0.0

---

# 🇺🇸 About the Project

A personal task manager built with Java 21 and Gradle, designed to evolve progressively as different Java concepts are studied. Each phase adds new capabilities, enabling hands-on, incremental review of the language.

> **Note:** Some package structures and files are placeholders for future phases. Phase 1 uses only the in-memory repository and basic CLI.

## 🎯 Purpose

Build an organized and scalable system while reviewing fundamentals, OOP, collections, generics, exceptions, I/O, Streams, concurrency, SOLID, testing, and more.

## 🚀 Features (expanding)

* Basic task CRUD
* Priority, categories, and dates
* File persistence
* Reporting with Streams
* Async operations
* Architecture following best practices
* Testing with JUnit

## 🛠️ Technologies

* Java 21
* Gradle
* JUnit 5

## 📂 Initial Structure

```
src/
├── main/java/
└── test/java/
```
