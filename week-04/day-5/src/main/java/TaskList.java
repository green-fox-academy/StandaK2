import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> taskList;
    List<Status> statusList;

    public TaskList(List<Task> taskList, List<Status> statusList) {
        this.taskList = taskList;
        this.statusList = statusList;
    }

    public void addTask(String text) {
        this.taskList.add(new Task(text));
        this.statusList.add(new Status(0));
        System.out.println("adding task");
    }

    public void removeTask(int taskIndex) {
        this.taskList.remove(taskIndex - 1);
        this.statusList.remove(taskIndex - 1);
        System.out.println("removing task");
    }

    public void completeTask(int taskIndex) {
        System.out.println("task completed");
        statusList.get(taskIndex - 1).setStatus(1);
    }

    public String giveMeAllTasks() {
        String result = "";

        for (int i = 0; i < taskList.size(); i++) {
            result += ((i + 1) + ".\t" + statusList.get(i).getStatus() + "\t" + taskList.get(i).getText() + "\n");
        }
        return result;
    }

    public List<String> giveMeAllDataToSave() {
        List<String> allData = new ArrayList<>();

        for (int i = 0; i < this.taskList.size(); i++) {
            allData.add(taskList.get(i).getText() + ";" + statusList.get(i).getStatusIndex());
        }
        return allData;
    }
}
