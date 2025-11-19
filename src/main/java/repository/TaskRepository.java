package repository;

import model.Task;

import java.util.List;

public interface TaskRepository {

    // Salvar uma nova tarefa (gerar ID) ou atualiza uma existente.
    public void save(Task task);

    //Retornar todas as tarefas cadastradas
    public List<Task> findAll();

    //Retornar tarefa por id

}
