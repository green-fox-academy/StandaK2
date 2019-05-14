import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
//        Write a Stream Expression to get the even numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> evenNumbers = numbers.stream()
                .filter(evenNumber -> evenNumber %2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);


//    Write a Stream Expression to get the squared value of the positive numbers from the list:

    List<Integer> squaredNumbers = numbers.stream()
            .filter(evenNumber -> evenNumber > 0)
            .map(evenNumber -> evenNumber * evenNumber)
            .collect(Collectors.toList());

        System.out.println(squaredNumbers);


//    Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> biggerNumbers = numbers2.stream()
                //.map(biggerNumber -> biggerNumber * biggerNumber)
                .filter(biggerNumber -> biggerNumber * biggerNumber > 20)
               // .map(biggerNumber -> biggerNumber * biggerNumber)

                .collect(Collectors.toList());

        System.out.println(biggerNumbers);

//   Write a Stream Expression to get the average value of the odd numbers from the list:

       double averageValue = numbers.stream()
                .filter(evenNumber -> evenNumber %2 != 0)
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(averageValue);


//    Write a Stream Expression to get the sum of the odd numbers in the following list:

    List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        Integer sum = numbers3.stream()
                .filter(evenNumber -> evenNumber %2 != 0)
                .reduce(0, (a, b) -> (a + b));
        System.out.println(sum);

        Integer sum2 = numbers3.stream()
                .filter(evenNumber -> evenNumber %2 != 0)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum2);

//        Write a Stream Expression to find the uppercase characters in a string!
        


    }
}
