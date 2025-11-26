package repository;

import exception.TaskNotFoundException;
import model.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryRepository implements TaskRepository{
    private HashMap<Long, Task> database;
    private AtomicLong idCounter; //Using atomic long to avoid duplicates in database in specific case. Its to future modifies...

    @Override
    public Task save(Task task) {
        if (task.getId() == null){
            Task taskNew = new Task(idCounter.getAndIncrement(), task.getTitle(), task.getDescription(), task.isCompleted(), task.getDueDate());
            database.put(taskNew.getId(),taskNew);
            return taskNew;
        }
        if (database.containsKey(task.getId())) {
            database.put(task.getId(), task);
            return task;
        }
        throw new TaskNotFoundException("Não foi possível atualizar. Tarefa com ID " + task.getId() + " não encontrada.");
    }
    @Override
    public List<Task> findAll(){

    }
    @Override
    public Optional<Task> findAllById(Long id){

    }
    @Override
    public void deleteById(Long id){

    }
}
