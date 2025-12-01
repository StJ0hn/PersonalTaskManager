package controller;

import exception.InvalidTaskDataException;
import model.Task;
import service.TaskService;
import view.TaskView;

public class TaskController {
    private final TaskView taskView;
    private final TaskService taskService;

    public TaskController(TaskView taskView, TaskService taskService){
        this.taskView = taskView;
        this.taskService = taskService;
    }

    public void start(){
        while (true){
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
        } catch (InvalidTaskDataException error) {
            taskView.showError(error.getMessage());
        }
    }

}
