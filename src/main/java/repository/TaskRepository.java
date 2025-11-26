package repository;

import model.Task;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    // Save a new task (generate ID) or update a existent one
    public Task save(Task task);

    //Return all tasks
    public List<Task> findAll();

    //Return task by ID
    public Optional<Task> findById(Long id);

    //Delete task by ID
    public void deleteById(Long id);
}
