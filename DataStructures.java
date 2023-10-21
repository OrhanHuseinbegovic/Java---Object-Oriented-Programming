package Week4LAB;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", TaskStatus.COMPLETED));
    }
    // TODO create a method to get all objects
    public List<TaskItem>  getAllObjects(){
        return this.tasks;
    }

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status

    public Optional<TaskItem> getByStatus(TaskStatus currStat){
        tasks = tasks.stream()
                .filter(tasks -> tasks.getTaskStatus().equals(currStat))
                .collect(Collectors.toList());
        for (TaskItem t : tasks){
            System.out.println(t.getTaskId());
        }
    }

    // TODO create a method to find tasks whose id parameter greater than or equal to 2
    public List<TaskItem> findParameterGreatEqualToTwo(int taskId){
        return tasks
                .stream()
                .filter(TaskItem -> taskId >= 2)
                .toList();
    }

    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task

    public void taskDescription(){
        for (TaskItem t : tasks){
            System.out.println(t.getTaskDescription());
        }
    }
}

