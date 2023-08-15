package p2;

import java.util.PriorityQueue;

/**
 *
 * @author forer
 */
public class Main {
    public static void main(String[] args) {
        // Crea una PriorityQueue con el comparador personalizado
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new TaskComparator());

        // Agrega tareas con diferentes tiempos de ejecución y prioridades
        taskQueue.add(new Task(1, "Tarea 1", 2000, 2));
        taskQueue.add(new Task(2, "Tarea 2", 1000, 1));
        taskQueue.add(new Task(3, "Tarea 3", 1500, 3));

        //Ejecucion de las tareas
        while (!taskQueue.isEmpty()) {
            Task tarea = taskQueue.poll();
            System.out.println("Ejecutando tarea: " + tarea.getDescription());
            
            try {
                Thread.sleep(tarea.getExecutionTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}