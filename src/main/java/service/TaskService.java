package service;

import exception.InvalidTaskDataException;
import model.Task;
import repository.TaskRepository;
import java.time.LocalDate;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(String title, String description, LocalDate dueDate) {
        if (title == null || title.isEmpty()){
            throw new InvalidTaskDataException("The title is empty");
        }
        Task taskNew = new Task(title, description, dueDate);
        return taskRepository.save(taskNew);
    }

}