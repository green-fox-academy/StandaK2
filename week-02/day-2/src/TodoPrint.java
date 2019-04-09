// Expected output:
// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk";
        String stringToBegin = "My todo:"; // to the beginning of the todoText
        String stringToEnd = " - Download games"; // to the end of the todoText
        String stringWithIndent = "\t - Diablo";// to the end of the todoText but with indention


        String todoTextNew = "";
        todoTextNew = todoTextNew.join("\n", stringToBegin, todoText, stringToEnd, stringWithIndent);

        System.out.println(todoTextNew);
    }
}
