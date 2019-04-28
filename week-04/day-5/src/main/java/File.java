import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File {
    private String fileName;
    private Path filePath;
    private List<String> listFromFile;

    public File(String fileName) {
        this.fileName = fileName;
        this.filePath = Paths.get(fileName);
        this.listFromFile = new ArrayList<>();
    }

    private void loadListFromFile() {
        try {
            this.listFromFile = Files.readAllLines(this.filePath);
        } catch (IOException error) {
            System.out.println("Can't open the file");
        }
    }

    public void saveToFile(List<String> allData) {
        try {
            Files.write(this.filePath, allData);
        } catch (IOException error) {
            System.out.println("Can't write to the file");
        }
    }

    public List<Task> giveMeTaskList() {
        loadListFromFile();
        List<Task> taskList = new ArrayList<>();
        for (String task : this.listFromFile) {
            taskList.add(new Task(task.substring(0, task.indexOf(";"))));
        }
        return taskList;
    }

    public List<Status> giveMeStatusList() {
        loadListFromFile();
        List<Status> statusList = new ArrayList<>();
        for (String status : this.listFromFile) {
            statusList.add(new Status(Integer.parseInt(status.substring(status.indexOf(";") + 1))));
        }
        return statusList;
    }
}
