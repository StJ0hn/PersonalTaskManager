package controller;

import exception.InvalidTaskDataException;
import exception.TaskNotFoundException;
import model.Task;
import service.TaskService;
import view.TaskView;

import java.util.List;

public class TaskController {
    private final TaskView taskView;
    private final TaskService taskService;

    public TaskController(TaskView taskView, TaskService taskService){
        this.taskView = taskView;
        this.taskService = taskService;
    }

    boolean running = true;
    public void start(){
        while (running){
            int option = taskView.showMenu();

            switch (option){
                case 1:
                    createTask();
                    break;
                case 2:
                    listAllTasks();
                    break;
                case 3:
                    searchByTask();
                    break;
                case 4:
                    updateTask();
                    break;
                case 5:
                    completeTask();
                    break;
                case 6:
                    deleteTask();
                    break;
                case 0:
                    System.out.println("CLOSING PROGRAM...");
                    running = false;
                    break;
                default:
                    System.out.println("INVALID OPTION. TRY AGAIN");
                    break;
            }
        }
    }

    private void createTask(){
        try{
            Task data = taskView.readTaskData();
            Task createdTask = taskService.createTask(data.getTitle(), data.getDescription(), data.getDueDate());
            taskView.showMessage("SUCCESS! NEW TASK ID: " + createdTask.getId());
        } catch (InvalidTaskDataException exception) {
            taskView.showError(exception.getMessage());
        }
    }

    private void listAllTasks(){
        List<Task> tasks = taskService.listAllTasks();
        taskView.showTaskList(tasks);
    }

    private void searchByTask(){
        Long id = taskView.readId();

        if (id == null) return;

        try {
            Task task = taskService.getTaskById(id);
            taskView.showTask(task);
        } catch (TaskNotFoundException exception){
            taskView.showError(exception.getMessage());
        }
    }

    private void updateTask(){
        Long id = taskView.readId();
        if (id == null) return;
        try {
            taskService.getTaskById(id);
            System.out.println("---TYPE NEW DATA---");
            Task newData = taskView.readTaskData();
            taskService.updateTask(id, newData.getTitle(), newData.getDescription(), newData.getDueDate());
            taskView.showMessage("TASK UPDATED!");
        } catch (InvalidTaskDataException | TaskNotFoundException exception) {
            taskView.showError(exception.getMessage());
        }
    }

    private void completeTask(){
        Long id = taskView.readId();
        if (id == null) return;
        try {
            taskService.completeTask(id);
            taskView.showMessage("STATUS OF TASK -> COMPLETED.");
        } catch (TaskNotFoundException exception){
            taskView.showError(exception.getMessage());
        }
    }

    private void deleteTask(){
        Long id = taskView.readId();
        if (id == null) return;
        try {
            taskService.deleteById(id);
            taskView.showMessage("TASK DELETED");
        } catch (TaskNotFoundException exception) {
            taskView.showError(exception.getMessage());
        }
    }

}
