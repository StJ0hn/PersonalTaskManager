package repository;

import exception.TaskNotFoundException;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class InMemoryRepository implements TaskRepository{
    private final HashMap<Long, Task> database = new HashMap<>();
    private long idCounter= 1;

    @Override
    public Task save(Task task) {
        if (task.getId() == null){
            Task newTask = new Task(idCounter++, task.getTitle(), task.getDescription(), task.isCompleted(), task.getDueDate());
            database.put(newTask.getId(),newTask);
            return newTask;
        }
        if (database.containsKey(task.getId())) {
            database.put(task.getId(), task);
            return task;
        }
        throw new TaskNotFoundException("It was not possible to update. Task with ID " + task.getId() + " not found.");
    }
    @Override
    public List<Task> findAll(){
        return new ArrayList<>(database.values());
    }
    @Override
    public Optional<Task> findById(Long id){
        return Optional.ofNullable(database.get(id));
    }
    @Override
    public void deleteById(Long id){
        database.remove(id);
    }
}
