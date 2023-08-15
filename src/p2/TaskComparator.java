package p2;

import java.util.Comparator;

/**
 *
 * @author forer
 */
public class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        // Compara las tareas por prioridad y luego por tiempo de ejecución
        if (task1.getPriority() != task2.getPriority()) {
            return Integer.compare(task2.getPriority(), task1.getPriority());
        } else {
            return Integer.compare(task1.getExecutionTime(), task2.getExecutionTime());
        }
    }
}