
package p2;

// Clase Task
public class Task {
    private int id;
    private String description;
    private int executionTime;
    private int priority;

    public Task(int id, String description, int executionTime, int priority) {
        this.id = id;
        this.description = description;
        this.executionTime = executionTime;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public int getPriority() {
        return priority;
    }
}




 
