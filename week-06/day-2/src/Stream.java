import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Stream {

    public static void main(String[] args) {

//        Exercise 1
//        Write a Stream Expression to get the even numbers from the following list:

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> evenNumbers = numbers.stream()
                .filter(evenNumber -> evenNumber %2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

//    Exercise 2
//    Write a Stream Expression to get the squared value of the positive numbers from the list:

    List<Integer> squaredNumbers = numbers.stream()
            .filter(evenNumber -> evenNumber > 0)
            .map(evenNumber -> evenNumber * evenNumber)
            .collect(Collectors.toList());

        System.out.println(squaredNumbers);

//    Exercise 3
//    Write a Stream Expression to find which number squared value is more then 20 from the following list:

        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> biggerNumbers = numbers2.stream()
                //.map(biggerNumber -> biggerNumber * biggerNumber)
                .filter(biggerNumber -> biggerNumber * biggerNumber > 20)
               // .map(biggerNumber -> biggerNumber * biggerNumber)

                .collect(Collectors.toList());

        System.out.println(biggerNumbers);

//    Exercise 4
//   Write a Stream Expression to get the average value of the odd numbers from the list:

       double averageValue = numbers.stream()
                .filter(evenNumber -> evenNumber %2 != 0)
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(averageValue);


//    Exercise 5
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


//    Exercise 6
//        Write a Stream Expression to find the uppercase characters in a string!

        String text = "Standa Koumar";
        List<Character> charArray= text.chars()
                .filter(Character::isUpperCase)
                .mapToObj(letter -> (char)letter)
                .collect(Collectors.toList());
        System.out.println(charArray);


//    Exercise 7
//        Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");


        List<String> newCities = cities.stream()
                .filter(city -> city.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(newCities);


//    Exercise 8
//        Write a Stream Expression to concatenate a Character list to a string!
        List<Character> charList = Arrays.asList('S', 't', 'a', 'n', 'd', 'a');

        String word = charList.stream()
                .map(x -> x.toString())
                .collect(Collectors.joining());
        System.out.println(word);


//    Exercise 9
//        Write a Stream Expression to find the frequency of characters in a given string!

        String text2 = "Standa Koumar";
        Map<Character, Long> charArray2 = text2.chars()
                .mapToObj(letter -> (char)letter)
                .collect(groupingBy(Function.identity(), counting()));

                // for INTEGER
                //.collect(groupingBy(Function.identity(), summingInt(e -> 1)));

        System.out.println(charArray2);


//    Exercise 10
//        Create a Fox class with 3 properties:name, color and age
//        Fill a list with at least 5 foxes and:
//
//        Write a Stream Expression to find the foxes with green color!
//                Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//                Write a Stream Expression to find the frequency of foxes by color!

        List<Fox> foxes = Arrays.asList(
                new Fox("polar", "white", 2 ),
                new Fox("greenfox", "green", 4 ),
                new Fox("ferrilata", "red", 3 ),
                new Fox("old fox", "brown", 15 ),
                new Fox("chimney fox", "black", 8 ),
                new Fox("greenfox2", "green", 8 ));

        List<String> greenFoxes = foxes.stream()
                .filter(fox -> fox.getColor() == "green")
                .filter(fox -> fox.getAge() < 5)
                .map(Fox::getName)
                .collect(Collectors.toList());
        System.out.println(greenFoxes);

        Map<String, Long> foxFrequency = foxes.stream()
                .map(Fox::getColor)
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        System.out.println(foxFrequency);


     //    Exercise 11
//        Find a random Wikipedia article and copy the contents to a txt file.
//
//        Create a Stream expression which reads all text from this file, and prints
//        the 100 most common words in descending order. Keep in mind that the text contains
//        punctuation characters which should be ignored.

                String fileName = "article.txt";

        try {
            String[] article = Files.readAllLines(Paths.get(fileName)).stream()
                    .map(w -> w.replace(".", ""))
                    .map(w -> w.replace(",", ""))
                    .map(w -> w.replace("\"", ""))
                    .map(w -> w.replace(")", ""))
                    .map(w -> w.replace("(", ""))
                    .map(w -> w.toLowerCase())
                    .collect(Collectors.joining()).split(" ");

            Map<String, Long> wordFrequency = Arrays.stream(article)
                    .collect(Collectors.groupingBy(Function.identity(), counting()));

            wordFrequency.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .limit(2)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("can not open files");
        }
    }
}
