package service;

import exception.InvalidTaskDataException;
import model.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.TaskRepository;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

// 1. Habilita o Mockito para criar os objetos falsos
@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    // 2. Cria um Repositório Falso (Mock)
    @Mock
    private TaskRepository taskRepository;

    // 3. Cria o Service de verdade e INJETA o repositório falso nele
    @InjectMocks
    private TaskService taskService;

    // 4. O Teste da Regra de Negócio (RN01)
    @Test
    void testCreateTask_shouldThrowExceptionIfTitleIsNull() {
        // Cenário: Data válida, mas título nulo
        LocalDate dueDate = LocalDate.now().plusDays(1);

        // Ação e Verificação:
        // "Espero que lance InvalidTaskDataException quando eu chamar createTask com título null"
        Assertions.assertThrows(InvalidTaskDataException.class, () -> { taskService.createTask(null, "Descrição teste", dueDate);
        });
    }

    @Test
    void testCreateTask_shouldCreateTaskSuccessfully() {
        // 1. PREPARAR (Arrange)
        String title = "Estudar Mockito";
        String description = "Entender como simular retornos";
        LocalDate dueDate = LocalDate.now().plusDays(1);

        // Simulamos a tarefa que o Banco "devolveria" (já com ID 1)
        Task taskWithId = new Task(1L, title, description, false, dueDate);

        // O ENSAIO (Stubbing):
        // "Quando o repositório chamar save() com QUALQUER tarefa (any), retorne a 'taskWithId'"
        when(taskRepository.save(any(Task.class))).thenReturn(taskWithId);

        // 2. EXECUTAR (Act)
        Task createdTask = taskService.createTask(title, description, dueDate);

        // 3. VERIFICAR (Assert)
        Assertions.assertNotNull(createdTask, "A tarefa não deveria ser nula");
        Assertions.assertEquals(1L, createdTask.getId(), "A tarefa deveria ter o ID retornado pelo banco");
        Assertions.assertEquals(title, createdTask.getTitle());
        Assertions.assertFalse(createdTask.isCompleted(), "A tarefa nova deve nascer incompleta (RN02)");
    }
}