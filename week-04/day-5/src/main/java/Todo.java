public class Todo {

    public static void main(String[] args) {

        File myFile = new File("todo.txt");
        TaskList myToDo = new TaskList(myFile.giveMeTaskList(), myFile.giveMeStatusList());

        if (args.length == 0) {
            System.out.println("****** TO-DO APPLICATION with command-line ******\n" +
                                "Command line arguments:\n" +
                                "\t-l\tLists all the tasks\n" +
                                "\t-a\tAdds a new task\n" +
                                "\t-r\tRemoves a task\n" +
                                "\t-c\tCompletes a task");

        } else {

            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {

                    case "-l":
                        System.out.println("Your todo list:");
                        System.out.println(myToDo.giveMeAllTasks());
                        break;

                    case "-a":
                        myToDo.addTask(args[i + 1]);
                        i++;
                        myFile.saveToFile(myToDo.giveMeAllDataToSave());
                        break;

                    case "-r":
                        myToDo.removeTask(Integer.parseInt(args[i + 1]));
                        i++;
                        myFile.saveToFile(myToDo.giveMeAllDataToSave());
                        break;

                    case "-c":
                        myToDo.completeTask(Integer.parseInt(args[i + 1]));
                        i++;
                        myFile.saveToFile(myToDo.giveMeAllDataToSave());
                        break;

                    default:
                        System.out.println("unknown argument");
                }
            }
        }
    }
}
