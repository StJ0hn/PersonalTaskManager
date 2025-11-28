package service;

import exception.InvalidTaskDataException;
import exception.TaskNotFoundException;
import model.Task;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.TaskRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    //Test to method createTask
    @Test
    void testCreateTask_shouldThrowExceptionIfTitleIsNull() {
        LocalDate dueDate = LocalDate.now().plusDays(1);
        Assertions.assertThrows(InvalidTaskDataException.class, () -> { taskService.createTask(null, "Test Description", dueDate);
        });
    }

    //REFACTOR
    @Test
    void testCreateTask_shouldCreateTaskSuccessfully() {
        // 1. PREPARAR (Arrange)
        String title = "Study Mockito";
        String description = "know how simulate returns";
        LocalDate dueDate = LocalDate.now().plusDays(1);

        Task taskWithId = new Task(1L, title, description, false, dueDate);

        // O ENSAIO (Stubbing):
        when(taskRepository.save(any(Task.class))).thenReturn(taskWithId);

        // 2. EXECUTAR (Act)
        Task createdTask = taskService.createTask(title, description, dueDate);

        // 3. VERIFICAR (Assert)
        Assertions.assertNotNull(createdTask, "The task wont should be null");
        Assertions.assertEquals(1L, createdTask.getId(), "The task should be return ID by database");
        Assertions.assertEquals(title, createdTask.getTitle());
        Assertions.assertFalse(createdTask.isCompleted(), "the new task should be born incomplete(RN02)");
    }

    //REFACTOR
    @Test
    void testListAllTasks_shouldbeListAllTasksSucefully(){
        //Arrange
        //False tasks list with two tasks
        LocalDate futureDateOne = LocalDate.of(2026,3,26);
        LocalDate futureDateTwo = LocalDate.of(2026,3,27);
        Task falseTaskOne = new Task(1L,"Study Java For new Job", "its a urgent task", false, futureDateOne);
        Task falseTaskTwo = new Task(2L,"Due Leetcode", "its very important",false, futureDateTwo);
        List<Task> falseListOfTasks = List.of(falseTaskOne, falseTaskTwo);

        //Say to  mock: "when calls method findAll, return falseListOfTasks"
        when(taskRepository.findAll()).thenReturn(falseListOfTasks);

        //Act
        //call the service (returns null for the red test)
        List<Task> resultOfService = taskService.listAllTasks();

        //Assert
        //this result will be faile now, because resultOfService its null
        Assertions.assertNotNull(resultOfService,"List return wont should be null");
        Assertions.assertEquals(2,resultOfService.size(), "should be return 2 tasks");
        Assertions.assertEquals(falseListOfTasks,resultOfService,"the list returned should be indentic of a repository");

        //extra verify of comportament
        // to ensure service call repository one time
        verify(taskRepository, times(1)).findAll();
    }

    //Good path
    @Test
    void testDeleteTaskById_shouldBeDeleteTaskById(){
        //Arrange
        Long id = 1L;
        Task task = new Task(id,"Delete", "Desc", false, LocalDate.now());

        // simulate task exists in database
        when(taskRepository.findById(id)).thenReturn(Optional.of(task));

        //Act
        taskService.deleteById(id);

        //Assert
        verify(taskRepository,times(1)).deleteById(id);
    }

    //bad path
    @Test
    void testDeleteTaskById_ShouldThrowException_WhenIdDoesNotExist(){
        //Arrange
        Long id = 99L;
        when(taskRepository.findById(id)).thenReturn(Optional.empty());
        //Act & Assert
        Assertions.assertThrows(TaskNotFoundException.class, () -> {taskService.deleteById(id);});
        //to ensure delete never be called
        verify(taskRepository, never()).deleteById(id);
    }
}