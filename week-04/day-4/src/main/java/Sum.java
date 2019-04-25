import java.util.ArrayList;

public class Sum {

    public ArrayList<Integer> numbers;

    public Sum(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumOfNumbers(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number:numbers) {
            sum += number;
        }
        return sum;
    }
}
