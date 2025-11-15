# 📌 Personal Task Manager – Java 21 (Gradle)

Um gerenciador pessoal de tarefas desenvolvido em **Java 21** com **Gradle**, projetado para evoluir progressivamente conforme diferentes tópicos da linguagem são estudados. Cada etapa do aprendizado adiciona novas funcionalidades, permitindo revisar Java de forma prática e estruturada.

## 🎯 Objetivo
Construir um sistema organizado e escalável enquanto revisa os pilares da linguagem, incluindo fundamentos, POO, coleções, generics, exceções, I/O, Streams, concorrência, SOLID, testes e mais.

## 🚀 Funcionalidades (em expansão)
- CRUD básico de tarefas  
- Classificação por prioridade, categorias e datas  
- Persistência em arquivo  
- Filtros e relatórios usando Streams  
- Serviços assíncronos com concorrência  
- Arquitetura seguindo princípios SOLID  
- Testes com JUnit e Mockito  

## 🛠️ Tecnologias
- Java 21  
- Gradle  
- JUnit 5  
- (Demais dependências serão adicionadas conforme o avanço do projeto)

## 📂 Estrutura inicial
src/

├── main/java/

└── test/java/
---

# Personal Task Manager — Checklist de Fases

Abaixo estão todas as fases do projeto, cada uma com descrição, objetivos, entregas e estrutura de diretórios prevista. Você irá atualizar o **status** conforme evoluir.

---

## **Fase 1 — Núcleo do Sistema**

**Status:** *Pendente*
**Objetivo:** Construir a base funcional mínima.
**Entrega:** v1.0.0

### Funcionalidades

* Criar, editar, listar e excluir tarefas.
* Cada tarefa contém:

  * título
  * descrição
  * data de criação
  * status (PENDENTE, EM_ANDAMENTO, CONCLUIDA)

### Arquitetura

* Camadas: **domain → application → infra → interface**.
* Repositório em memória.
* CLI simples para testar.

### Estrutura de diretórios

```
/personal-task-manager
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
      SqlTaskRepository.java
    /serialization
      JsonTaskExporter.java
  /interface
    /cli
      MainCLI.java
    /rest
      TaskController.java
```

---

## **Fase 2 — Sistema de Categorias e Prioridades**

**Status:** *Pendente*
**Objetivo:** Expandir a modelagem das tarefas.
**Entrega:** v1.1.0

### O que será implementado

* Adicionar categorias às tarefas.
* Adicionar níveis de prioridade.
* Atualizar serviços para lidar com novos atributos.

### Estrutura de diretórios

*(mantém a anterior, com inclusão lógica)*

```
/domain
  Category.java
  Priority.java
/application/services
  UpdateTaskService.java (expandido)
```

---

## **Fase 3 — Persistência em Arquivo (JSON)**

**Status:** *Pendente*
**Objetivo:** Permitir salvar e carregar tarefas.
**Entrega:** v1.2.0

### O que será implementado

* Serialização JSON.
* Persistência automática ao criar, editar e excluir.

### Estrutura

```
/infra/serialization
  JsonTaskExporter.java
  JsonTaskImporter.java
```

---

## **Fase 4 — Relatórios e Exportações**

**Status:** *Pendente*
**Objetivo:** Melhorar visualização e organização.
**Entrega:** v1.3.0

### O que será implementado

* Exportar tarefas por status.
* Exportar tarefas por prioridade.
* Relatórios em JSON e TXT.

### Estrutura

```
/infra/serialization
  TxtTaskExporter.java
/application/services
  GenerateReportsService.java
```

---

## **Fase 5 — CLI Profissional**

**Status:** *Pendente*
**Objetivo:** Oferecer experiência profissional no terminal.
**Entrega:** v1.4.0

### O que será implementado

* Comandos aninhados.
* Melhor formatação.
* Mensagens de erro claras.

### Estrutura

```
/interface/cli
  Commands/
    CreateCommand.java
    UpdateCommand.java
    ListCommand.java
    DeleteCommand.java
  MainCLI.java
```

---

## **Fase 6 — Banco de Dados SQL (H2)**

**Status:** *Pendente*
**Objetivo:** Evoluir repositório.
**Entrega:** v2.0.0

### O que será implementado

* DAO em H2.
* Migração automática de schema.

### Estrutura

```
/infra/db
  SqlTaskRepository.java
  migrations.sql
```

---

## **Fase 7 — API REST completa**

**Status:** *Pendente*
**Objetivo:** Transformar o sistema em backend moderno.
**Entrega:** v3.0.0

### O que será implementado

* Controllers REST.
* DTOs.
* Validações.
* Documentação com OpenAPI.

### Estrutura

```
/interface/rest
  TaskController.java
  dto/
    TaskRequest.java
    TaskResponse.java
```

---

## **Fase 8 — Frontend Web (HTML/CSS/JS)**

**Status:** *Pendente*
**Objetivo:** Criar interface visual simples.
**Entrega:** v3.1.0

### O que será implementado

* Tela de listagem.
* Tela de criação.
* Tela de edição.
* Fetch API para consumir o backend.

### Estrutura

```
/web
  index.html
  create.html
  edit.html
  assets/
    styles.css
    app.js
```

---

## **Fase 9 — Deploy + Portfólio**

**Status:** *Pendente*
**Objetivo:** Tornar público e profissional.
**Entrega:** v4.0.0

### O que será feito

* Deploy no Render, Railway ou Fly.io.
* Guia de instalação no README.
* Publicação no LinkedIn.
* Demo pública.

### Estrutura

```
/docs
  installation.md
  api-spec.yaml
```

---

## 🇺🇸 About the Project
A personal task manager built with **Java 21** and **Gradle**, designed to evolve as different Java topics are studied. Each stage adds new features, enabling practical, hands-on review of the language.

### 🎯 Purpose
Develop an organized, scalable system while reviewing fundamentals, OOP, collections, generics, exceptions, I/O, Streams, concurrency, SOLID, testing, and more.

### 🚀 Features (expanding)
- Basic task CRUD  
- Priority, categories, and due dates  
- File persistence  
- Filters and reports with Streams  
- Asynchronous services  
- SOLID-based architecture  
- Tests with JUnit and Mockito  

### 🛠️ Technologies
- Java 21  
- Gradle  
- JUnit 5  

### 📂 Initial structure
src/

├── main/java/

└── test/java/
---

# Personal Task Manager — Phase Checklist (English Version)

Below is the full English version of all project phases, matching your Portuguese structure.

---

## **Phase 1 — System Core**

**Status:** *Pending*
**Objective:** Build the minimum functional base.
**Delivery:** v1.0.0

### Features

* Create, edit, list, and delete tasks.
* Each task contains:

  * title
  * description
  * creation date
  * status (PENDING, IN_PROGRESS, COMPLETED)

### Architecture

* Layers: **domain → application → infra → interface**.
* In-memory repository.
* Simple CLI for testing.

### Directory Structure

```
/personal-task-manager
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
      SqlTaskRepository.java
    /serialization
      JsonTaskExporter.java
  /interface
    /cli
      MainCLI.java
    /rest
      TaskController.java
```

---

## **Phase 2 — Categories and Priorities System**

**Status:** *Pending*
**Objective:** Expand task modeling.
**Delivery:** v1.1.0

### What will be implemented

* Add categories to tasks.
* Add priority levels.
* Update services to handle new attributes.

### Directory Structure

```
/domain
  Category.java
  Priority.java
/application/services
  UpdateTaskService.java (expanded)
```

---

## **Phase 3 — File Persistence (JSON)**

**Status:** *Pending*
**Objective:** Enable saving and loading tasks.
**Delivery:** v1.2.0

### What will be implemented

* JSON serialization.
* Automatic persistence on create, update, delete.

### Directory Structure

```
/infra/serialization
  JsonTaskExporter.java
  JsonTaskImporter.java
```

---

## **Phase 4 — Reports and Exports**

**Status:** *Pending*
**Objective:** Improve organization and visualization.
**Delivery:** v1.3.0

### What will be implemented

* Export tasks by status.
* Export tasks by priority.
* Reports in JSON and TXT.

### Directory Structure

```
/infra/serialization
  TxtTaskExporter.java
/application/services
  GenerateReportsService.java
```

---

## **Phase 5 — Professional CLI**

**Status:** *Pending*
**Objective:** Provide a professional terminal experience.
**Delivery:** v1.4.0

### What will be implemented

* Nested commands.
* Improved formatting.
* Clear error messages.

### Directory Structure

```
/interface/cli
  Commands/
    CreateCommand.java
    UpdateCommand.java
    ListCommand.java
    DeleteCommand.java
  MainCLI.java
```

---

## **Phase 6 — SQL Database (H2)**

**Status:** *Pending*
**Objective:** Evolve the repository.
**Delivery:** v2.0.0

### What will be implemented

* DAO with H2.
* Automatic schema migration.

### Directory Structure

```
/infra/db
  SqlTaskRepository.java
  migrations.sql
```

---

## **Phase 7 — Full REST API**

**Status:** *Pending*
**Objective:** Turn the system into a modern backend.
**Delivery:** v3.0.0

### What will be implemented

* REST controllers.
* DTOs.
* Validations.
* Documentation using OpenAPI.

### Directory Structure

```
/interface/rest
  TaskController.java
  dto/
    TaskRequest.java
    TaskResponse.java
```

---

## **Phase 8 — Web Frontend (HTML/CSS/JS)**

**Status:** *Pending*
**Objective:** Create a simple visual interface.
**Delivery:** v3.1.0

### What will be implemented

* Listing screen.
* Creation screen.
* Edit screen.
* Fetch API integration.

### Directory Structure

```
/web
  index.html
  create.html
  edit.html
  assets/
    styles.css
    app.js
```

---

## **Phase 9 — Deployment + Portfolio**

**Status:** *Pending*
**Objective:** Make the project public and professional.
**Delivery:** v4.0.0

### What will be done

* Deploy on Render, Railway, or Fly.io.
* Installation guide in README.
* LinkedIn post.
* Public demo.

### Directory Structure

```
/docs
  installation.md
  api-spec.yaml
```
