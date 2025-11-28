package service;

import exception.InvalidTaskDataException;
import exception.TaskNotFoundException;
import model.Task;
import repository.TaskRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(String title, String description, LocalDate dueDate) {
        if (title == null || title.isEmpty()){
            throw new InvalidTaskDataException("The title is empty.");
        }
        Task taskNew = new Task(title, description, dueDate);
        return taskRepository.save(taskNew);
    }

    public List<Task> listAllTasks() {
        return taskRepository.findAll();
    }


    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException("Task not found with ID: " + id));
    }

    public void deleteById(Long id){
        getTaskById(id);
        taskRepository.deleteById(id);
    }

    public Task updateTask (Long id, String title, String description, LocalDate dueDate){
        return null;
    }

}