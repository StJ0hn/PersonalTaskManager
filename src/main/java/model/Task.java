package model;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean isCompleted;
    private LocalDate dueDate;

    public Task(String title, String description, LocalDate dueDate) {
        setTitle(title);
        setDescription(description);
        this.isCompleted = false;
        setDueDate(dueDate);
    }

    public Task(Long id, String title, String description, boolean isCompleted, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", dueDate=" + dueDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (id == null) return false; //if id equals null and the object when im comparing are not the same, return false to prevent problems with collections
        if (o == null || getClass() != o.getClass())
            return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        //If the ID is null, the hash code will be based on the memory address.
        if(id == null)
            return super.hashCode();
        return Objects.hashCode(id);
    }
}
