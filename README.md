PersonalTaskManager

## 🇧🇷 Português

### Sobre este Projeto

Um projeto de gerenciador de tarefas pessoal que cresce à medida que tópicos de Java são aprendidos. Cada conceito da linguagem adiciona novas funcionalidades, permitindo a revisão prática e a construção gradual de um sistema organizado, escalável e bem estruturado.

Este projeto é um mapa de aprendizado prático, evoluindo de uma simples aplicação de console para um sistema fullstack robusto.

**Nota de Engenharia:** Este projeto adota estritamente o TDD (Test-Driven Development) para validar a arquitetura e as regras de negócio antes da implementação.

---

## 🗺️ Roteiro de Evolução

### **Fase 1: A Fundação (Java Puro e CLI)**

**Status:** [ ] Em andamento

#### Arquitetura Alvo:

* **Model:** POJOs que representam dados (`Task.java`).
* **View:** Classes responsáveis pela interação via console (`TaskView.java`).
* **Controller:** Orquestrador que conecta a View às regras de negócio (`TaskController.java`).
* **Service:** Contém toda a lógica de negócios (`TaskService.java`).
* **Repository:** Interface de acesso a dados (`TaskRepository.java`), com implementação inicial em memória (`InMemoryTaskRepository.java`).

#### Checklist da Fase 1:

* [x] Estruturar o projeto (Gradle/Maven)
* [x] Criar o Modelo `Task.java`
* [ ] Implementar `TaskRepository` + `InMemoryTaskRepository`
* [ ] Implementar `TaskService` (TDD)
* [ ] Implementar `TaskView`
* [ ] Implementar `TaskController`
* [ ] Criar classe `Main`
* [ ] Aplicação CLI funcional (CRUD completo)

---

### **Fase 2: Transição para a Web (Spring Boot REST API)**

**Status:** [ ] Não iniciada

#### Checklist:

* [ ] Adicionar dependências Spring Boot
* [ ] Refatorar `TaskController` → `@RestController`
* [ ] Criar endpoints REST:

  * POST /api/tasks
  * GET /api/tasks
  * GET /api/tasks/{id}
  * PUT /api/tasks/{id}
  * DELETE /api/tasks/{id}
* [ ] Implementar Injeção de Dependência (@Service, @Repository)
* [ ] Remover completamente o código da CLI
* [ ] Testar endpoints (Postman/Insomnia)

---

### **Fase 3: Profissionalizando o Backend (Banco de Dados)**

**Status:** [ ] Não iniciada

#### Checklist:

* [ ] Adicionar dependências JPA + driver
* [ ] Configurar DB no `application.properties`
* [ ] Anotar `Task.java` como `@Entity`
* [ ] Trocar InMemoryRepo → `TaskRepository extends JpaRepository`
* [ ] Implementar DTOs (Request/Response)
* [ ] Validar com `spring-boot-starter-validation`

---

### **Fase 4: Construindo o Frontend (Fullstack)**

**Status:** [ ] Não iniciada

#### Checklist:

* [ ] Criar projeto frontend (React/Vue/Angular)
* [ ] Criar UI (listar, adicionar, concluir)
* [ ] Consumir API via fetch/axios
* [ ] Configurar CORS no backend
* [ ] Aplicação fullstack funcional

---

### **Fase 5: Nível Bônus (Produção e Ecossistema)**

**Status:** [ ] Não iniciada

#### Checklist:

* [ ] Testes unitários e de integração
* [ ] Spring Security + JWT
* [ ] Dockerfile
* [ ] CI/CD (GitHub Actions) + Deploy (Render/Heroku/Vercel)

---

# 🇺🇸 English

## About this Project

A personal task manager project that grows as Java topics are learned. Each concept adds new features, enabling practical review and gradual construction of a scalable and well‑structured system.

The project evolves from a console-based application to a full‑stack system.

**Engineering Note:** This project strictly uses TDD to validate architecture and business rules before implementation.

---

## 🗺️ Evolution Roadmap

### **Phase 1: The Foundation (Pure Java & CLI)**

**Status:** [ ] In Progress

#### Target Architecture:

* **Model:** POJOs (`Task.java`)
* **View:** Console interaction (`TaskView.java`)
* **Controller:** Orchestrates interaction (`TaskController.java`)
* **Service:** Business logic (`TaskService.java`)
* **Repository:** Data access (`TaskRepository.java` + `InMemoryTaskRepository`)

#### Phase 1 Checklist:

* [x] Project structure
* [x] `Task.java` model
* [ ] In-memory repository
* [ ] Business logic (TDD)
* [ ] Console view
* [ ] Controller
* [ ] Main class
* [ ] Full CLI CRUD

---

### **Phase 2: REST API (Spring Boot)**

**Status:** [ ] Not Started

Checklist follows same structure as in Portuguese.

---

### **Phase 3: Backend Professionalization (Database)**

**Status:** [ ] Not Started

### **Phase 4: Frontend Development**

**Status:** [ ] Not Started

### **Phase 5: Deployment & Ecosystem**

**Status:** [ ] Not Started

## Checklists (Português)

### Fase 1

* [x] Estruturar o projeto (Gradle/Maven)
* [x] Criar o Modelo Task.java
* [ ] Implementar a Interface TaskRepository com InMemoryTaskRepository
* [ ] Implementar o TaskService (TDD)
* [ ] Implementar a TaskView
* [ ] Implementar o TaskController
* [ ] Criar a classe Main
* [ ] CRUD completo via CLI

### Fase 2

* [ ] Adicionar dependências Spring Boot
* [ ] Transformar TaskController em @RestController
* [ ] Mapear endpoints CRUD
* [ ] Aplicar DI com @Service e @Repository
* [ ] Remover TaskView
* [ ] Testar endpoints via Postman/Insomnia

### Fase 3

* [ ] Adicionar dependências JPA
* [ ] Configurar banco no application.properties
* [ ] Anotar Task.java como @Entity
* [ ] Substituir InMemoryTaskRepository por JpaRepository
* [ ] Criar DTOs
* [ ] Atualizar TaskService para mapear DTOs/Entidades
* [ ] Adicionar validações (@Valid, @NotBlank)

### Fase 4

* [ ] Criar projeto frontend
* [ ] Criar componentes UI
* [ ] Conectar com a API via fetch/axios
* [ ] Configurar CORS
* [ ] Aplicação fullstack funcional

### Fase 5

* [ ] Testes unitários e de integração
* [ ] Spring Security + JWT
* [ ] Dockerfile
* [ ] CI/CD + Deploy

## Checklists (English)

### Phase 1

* [x] Structure project (Gradle/Maven)
* [x] Create Task.java model
* [ ] Implement TaskRepository with InMemoryTaskRepository
* [ ] Implement TaskService (TDD)
* [ ] Implement TaskView
* [ ] Implement TaskController
* [ ] Create Main class
* [ ] Full CRUD via CLI

### Phase 2

* [ ] Add Spring Boot dependencies
* [ ] Convert TaskController to @RestController
* [ ] Map CRUD endpoints
* [ ] Apply DI (@Service, @Repository)
* [ ] Remove TaskView
* [ ] Test endpoints

### Phase 3

* [ ] Add JPA dependencies
* [ ] Configure database
* [ ] Annotate Task.java with @Entity
* [ ] Replace InMemoryTaskRepository with JpaRepository
* [ ] Implement DTO pattern
* [ ] Update TaskService for DTO mapping
* [ ] Add validation

### Phase 4

* [ ] Create frontend project
* [ ] Create UI components
* [ ] Connect with backend
* [ ] Handle CORS
* [ ] Fullstack application

### Phase 5

* [ ] Unit & integration tests
* [ ] Spring Security + JWT
* [ ] Dockerfile
* [ ] CI/CD + Deploy
