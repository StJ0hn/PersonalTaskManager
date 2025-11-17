# PersonalTaskManager

## Sobre este Projeto
- Um projeto de gerenciador de tarefas pessoal que cresce à medida que tópicos de Java são aprendidos. Cada conceito da linguagem adiciona novas funcionalidades, permitindo a revisão prática e a construção gradual de um sistema organizado, escalável e bem estruturado.
- Este projeto é um mapa de aprendizado prático, evoluindo de uma simples aplicação de console para um sistema fullstack robusto.
--- 
## 🗺️ Roteiro de Evolução
Aqui estão as fases planejadas para a construção e evolução do PersonalTaskManager.
### Fase 1: A Fundação (Java Puro e CLI)
Status: [ ] Em andamento
- O objetivo desta fase é construir o núcleo da lógica de negócios e garantir uma arquitetura limpa (baseada em MVC-S-R) antes de tocar na web ou em bancos de dados.
Arquitetura Alvo:
- Model: POJOs (Plain Old Java Objects) para representar os dados (ex: Task.java).
- View: Classes dedicadas apenas a interagir com o console (ex: TaskView.java).
- Controller: O orquestrador que conecta a View às regras de negócio (ex: TaskController.java).
- Service: Camada que contém toda a lógica de negócios (validações, regras, etc.) (ex: TaskService.java).
- Repository: Uma interface que define como os dados são acessados (ex: TaskRepository.java), com uma implementação inicial em memória (ex: InMemoryTaskRepository.java).
### Checklist da Fase 1:
[x] Estruturar o projeto (Gradle/Maven).
[ ] Criar o Modelo Task.java.
[ ] Implementar a Interface TaskRepository com uma classe InMemoryTaskRepository.
[ ] Implementar o TaskService (lógica de negócios).
[ ] Implementar a TaskView (para entrada e saída no console).
[ ] Implementar o TaskController para orquestrar o fluxo.
[ ] Criar a classe Main que inicia a aplicação CLI.
[ ] Aplicação 100% funcional via linha de comando (CRUD completo).

---
### Fase 2: Transição para a Web (API REST com Spring Boot)
Status: [ ] Não iniciada
- O objetivo é substituir a "View" de console por um conjunto de endpoints de API REST, expondo nossa lógica de negócios para qualquer cliente (web, mobile, etc.).
Checklist da Fase 2:
[ ] Adicionar as dependências do Spring Boot (spring-boot-starter-web).
[ ] Refatorar o TaskController para ser um @RestController.
[ ] Mapear os métodos de CRUD para endpoints RESTful:
  - POST /api/tasks (Criar)
  - GET /api/tasks (Listar todos)
  - GET /api/tasks/{id} (Buscar um)
  - PUT /api/tasks/{id} (Atualizar)
  - DELETE /api/tasks/{id} (Deletar)
[ ] Introduzir a Injeção de Dependência (DI) do Spring (ex: @Service, @Repository, @Autowired no construtor).
[ ] Remover completamente o código da TaskView (CLI).
[ ] Testar todos os endpoints usando um cliente de API (Postman ou Insomnia).

--- 
### Fase 3: Profissionalizando o Backend (Banco de Dados e Boas Práticas)
Status: [ ] Não iniciada
- O objetivo é tornar nossos dados persistentes usando um banco de dados real e aplicar padrões de design essenciais (DTOs e Validação) para proteger nossa API.
Checklist da Fase 3:
[ ] Adicionar dependências (spring-boot-starter-data-jpa, driver de banco, ex: h2-database ou postgresql).
[ ] Configurar a conexão com o banco de dados no application.properties.
[ ] Anotar o modelo Task.java como uma @Entity.
[ ] Substituir a classe InMemoryTaskRepository pela interface TaskRepository estendendo JpaRepository.
[ ] Implementar o padrão DTO (Data Transfer Object):
  - TaskRequestDTO (para entrada de dados).
  - TaskResponseDTO (para saída de dados).
[ ] Atualizar o TaskService para mapear entre DTOs e Entidades.
[ ] Adicionar spring-boot-starter-validation e usar anotações (@NotBlank, @Valid) nos DTOs e no Controller.

---
### Fase 4: O "Fullstack" (Construindo o Frontend)
Status: [ ] Não iniciada
- O objetivo é construir uma interface de usuário gráfica (GUI) baseada na web que consome nossa API backend.
Checklist da Fase 4:
[ ] Iniciar um novo projeto Frontend (ex: React, Vue ou Angular) em uma pasta separada.
[ ] Criar componentes de UI para:
  - Listar tarefas (TaskList).
  - Adicionar nova tarefa (TaskForm).
  - Marcar tarefa como completa.
[ ] Usar fetch ou axios para fazer chamadas à API Spring Boot.
[ ] Lidar com CORS (Cross-Origin Resource Sharing) no backend (Spring Boot).
[ ] Aplicação fullstack funcional.

---
### Fase 5: Nível Bônus (Ecossistema e Produção)
Status: [ ] Não iniciada
- O objetivo é adicionar os componentes que tornam um projeto "pronto para produção": testes, segurança e deploy.
Checklist da Fase 5:
[ ] Testes:
[ ] Testes Unitários para o TaskService (com JUnit e Mockito).
[ ] Testes de Integração para o TaskController (com @SpringBootTest).
[ ] Segurança:
[ ] Adicionar spring-boot-starter-security.
[ ] Implementar autenticação (ex: Login/Senha ou JWT) para proteger a API.
[ ] Containerização:
[ ] Escrever um Dockerfile para a aplicação Spring Boot.
[ ] CI/CD & Deploy:
[ ] Criar um workflow de GitHub Actions para buildar e testar automaticamente.
[ ] Fazer o deploy do Backend (ex: Render, Heroku).
[ ] Fazer o deploy do Frontend (ex: Vercel, Netlify).
