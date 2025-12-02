import controller.TaskController;
import repository.InMemoryRepository;
import repository.TaskRepository;
import service.TaskService;
import view.TaskView;

public class Main {
    public static void main(String[] args) {

        TaskRepository repository = new InMemoryRepository();
        TaskService service = new TaskService(repository);
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view, service);

        controller.start();
    }
}
