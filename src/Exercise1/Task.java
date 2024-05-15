package src.Exercise1;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Task {

    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Boolean isCompleted;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.isCompleted = false;
    }

    private Task(String name, String description, LocalDateTime createdAt, Boolean isCompleted) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.isCompleted = isCompleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public Task copy(){
        return new Task(this.getName(),
                        this.getDescription(),
                        this.getCreatedAt(),
                        this.isCompleted);
    }
}
