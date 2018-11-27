import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Locale.filter;


public class Java8Assignment {

    public static void main(String[] args) {
        /**
         * Given the following input data.
         */

        //converts int stream to list of integers
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("One", "Two", "three", "four", "five", "six", "seven", "Eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "Fourteen", "fifteen", "sixteen", "Nineteen", "twenty");

        System.out.println("Example!");
        example(numbers);
        System.out.println();
        System.out.println("Task 2!");
        task_2(numbers);
        System.out.println();
        System.out.println("Task 3!");
        task_3(numbers);
        System.out.println();
        System.out.println("Task 4: simple print!");
        task_4(numbers, e->true);
        System.out.println();
        System.out.println("Task 4: odd numbers!");
        task_4(numbers, e-> e%2 !=0);
        System.out.println();
        System.out.println("Task 4: even numbers!");
        task_4(numbers, e-> e%2 == 0);
        System.out.println();
        System.out.println("Task 5!");
        task_5(numbers);
        System.out.println();
        System.out.println("Task 6!");
        task_6(numbers);
        System.out.println();
        System.out.println("Task 7!");
        task_7(numbers);
        System.out.println();
        System.out.println("Task 8!");
        task_8(numbers);
        System.out.println();
        System.out.println("Task 9: simple sum print!");
        task_9(numbers, e->true, e->true);
        System.out.println();
        System.out.println("Task 9: sum of odd numbers !");
        task_9(numbers, e-> e%2 != 0, e-> true);
        System.out.println();
        System.out.println("Task 9!: sum of even numbers");
        task_9(numbers, e-> e%2 == 0, e->true);
        System.out.println();
        System.out.println("Task 9: sum of the even numbers which contain '7'!");
        task_9(numbers,  e-> e%2 == 0 ,e -> e.toString().indexOf('7')> -1);
        System.out.println();
        System.out.println("Task 10");
        task_10(numbers);
        System.out.println();
        System.out.println("Task 11");
        task_11(numbers);
        System.out.println();
        System.out.println("Task 12");
        task_12(numbers);
        System.out.println();
        System.out.println("Task 13: sum of the double of even numbers");
        task_13(numbers,e->e%2 == 0, c->c*2);
        System.out.println();
        System.out.println("Task 13:  sum of the triple of odd numbers");
        task_13(numbers, e->e%2 != 0, c-> c*3);
        System.out.println();
        System.out.println("Task 13: sum of their half (1/2)");
        task_13(numbers, e-> true, c->c*1/2);
        System.out.println();
        System.out.println("Task 14");
        task_14(words);
        System.out.println();
        System.out.println("Task 15");
        List<String> l1 = task_15(words);
        l1.forEach(System.out::println);
        System.out.println();
        System.out.println("Task 16");
        List<String> l2 = task_16(words);
        l2.forEach(System.out::println);
        System.out.println();
        System.out.println("Task 17:all words starting with a vowel");
        List<String> l3 = task_17(words,e->e.charAt(0) == 'a' || e.charAt(0) == 'e' || e.charAt(0) == 'i' || e.charAt(0) == 'o' || e.charAt(0) == 'u' || e.charAt(0) == 'A' || e.charAt(0) == 'E' || e.charAt(0) == 'I' || e.charAt(0) == 'O' || e.charAt(0) == 'U');
        l3.forEach(System.out::println);
        System.out.println();
        System.out.println("Task 17:all words ending in teen");
        List<String> l4 = task_17(words,e->e.endsWith("teen"));
        l4.forEach(System.out::println);
        System.out.println();
        System.out.println("Task 18");
        Set<String> s1 = task_18(words);
        s1.forEach(System.out::println);
        System.out.println();
        System.out.println("Task 19");
        Set<Integer>s2 = task_19(words);
        s2.forEach(System.out::println);
        System.out.println();
        System.out.println("Task 20");
        Java8Method(numbers);
        System.out.println();
        System.out.println("Task 21");
        task_21(numbers);

        /**
         * Implement ONE method PER exercise given todos:
         */

        /**
         * For each
         */
        // 1: using "numbers" as input, print first ten numbers
//        example(numbers);
        // 2: using "numbers" as input print first ten odd numbers

        // 3: using "numbers" as input print first ten even numbers
        // 4: implement 1, 2, 3 using one method

        /**
         * Sums
         */
        // 5. using "numbers" as input print their sum
        // 6. using "numbers" as input print the sum of the odd numbers
        // 7. using "numbers" as input print the sum of the even numbers
        // 8. using "numbers" as input print the sum of the even numbers which contain '7'
        // 9. implement 5, 6, 7, 8 using one method

        /**
         * Mixed map/filter/reduce
         */
        // 10. using "numbers" calculate the sum of the double of even numbers
        // 11. using "numbers" calculate the sum of the triple of odd numbers
        // 12. using "numbers" calculate the sum of their half (1/2)
        // 13 implement 10, 11, 12 using one method

        /**
         * Collectors
         */
        // 14. using "words" as input print a string with each UPPERCASED word separated by ', '
        // 15. using "words" as input create a List containing all words starting with a vowel
        // 16. using "words" as input create a List containing all words ending in 'teen'
        // 17. implement 15 and 16 using one method
        // 18. using words as input create a Set of words with an odd number of letters
        // 19. using words as input create a Set containing the number of letters in a word

        /**
         * Converting to java 8
         */
        // 20. convert the following code to java 8
       // nonJava8Method(numbers);

        /**
         * Optional<T>
         */
        // 21. using "numbers" as input print the first odd number that can be divided by 121, if it does not exist print -1
    }

    //example

    private static void example(List<Integer> numbers) {
        numbers.stream()
                .limit(10)
                .map(num-> num + " ")
                .forEach(System.out::print);
    }

    // task_2
    // 2: using "numbers" as input print first ten odd numbers

    private static void task_2(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num%2 != 0)
                .limit(10)
                .map(num-> num + " ")
                .forEach(System.out::print);
    }

    // task_3
    // 3: using "numbers" as input print first ten even numbers

    private static void task_3(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num%2 == 0)
                .limit(10)
                .map(num-> num + " ")
                .forEach(System.out::print);
    }

    //task_4
    // 4: implement 1, 2, 3 using one method

    private static void task_4(List<Integer> numbers, Predicate<Integer> pred) {
        numbers.stream()
                .filter(pred)
                .limit(10)
                .map(num-> num + " ")
                .forEach(System.out::print);
    }

    //task_5
    // 5. using "numbers" as input print their sum

        private static void task_5(List<Integer> nums){
            Integer result = nums.stream()
                    .reduce(0, (res,e)->res+e);
            System.out.println(result);
        }

        //task 6
    // 6. using "numbers" as input print the sum of the odd numbers

    private static void task_6(List <Integer> nums){
        Integer result = nums.stream()
                .filter(num -> num%2 !=0)
                .reduce(0, (res,e)->res+e);
        System.out.println(result);
    }

    //task 7
    // 7. using "numbers" as input print the sum of the even numbers

    private static void task_7(List <Integer> nums){
        Integer result = nums.stream()
                .filter(num -> num%2 ==0)
                .reduce(0, (res,e)->res+e);
        System.out.println(result);
    }

    //task 8
    // 8. using "numbers" as input print the sum of the even numbers which contain '7'

    private static void task_8(List <Integer> nums){
        Integer result = nums.stream()
                .filter(num -> num.toString().indexOf('7')> -1)
                .filter(num -> num%2 ==0)
                .reduce(0, (res,e)->res+e);
        System.out.println(result);
    }

//task 9
// 9. implement 5, 6, 7, 8 using one method

    private static void task_9(List <Integer> nums, Predicate<Integer> pred1, Predicate<Integer> pred2) {
        Integer result = nums.stream()
                .filter(pred1)
                .filter(pred2)
                .reduce(0, (res,e)->res+e);
        System.out.println(result);
    }

    //task 10
    // 10. using "numbers" calculate the sum of the double of even numbers

    private static void task_10(List<Integer> nums){
        Integer result = nums.stream()
                .filter(num -> num%2 == 0)
                .map(num-> num*2)
                .reduce(0, (acc,e)->(acc+e));
        System.out.println(result);
    }

    //task 11
    // 11. using "numbers" calculate the sum of the triple of odd numbers

    private static void task_11(List<Integer> nums){
        Integer result = nums.stream()
                .filter(num -> num%2 != 0)
                .map(num-> num*3)
                .reduce(0, (acc,e)->(acc+e));
        System.out.println(result);
    }

    // 12. using "numbers" calculate the sum of their half (1/2)
    private static void task_12(List<Integer> nums){
        Integer result = nums.stream()
                .map(num-> num*1/2)
                .reduce(0, (acc,e)->(acc+e));
        System.out.println(result);
    }

    // 13 implement 10, 11, 12 using one method
    private static void task_13(List<Integer> nums,Predicate<Integer> pred, Function<Integer,Integer> mapper){
        Integer result = nums.stream()
                .filter(pred)
                .map(mapper)
                .reduce(0, (acc,e)->(acc+e));
        System.out.println(result);
    }

    // 14. using "words" as input print a string with each UPPERCASED word separated by ', '
    private static void task_14(List<String> words){
         List<String> result =  words.stream()
               .map(word -> word.toUpperCase() + ", ")
               .collect(Collectors.toList());
                result.forEach(System.out::println);
    }

    // 15. using "words" as input create a List containing all words starting with a vowel
    private static List<String> task_15(List<String> words){
        return (List<String>) words.stream()
                .filter(word -> word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U')
                .collect(Collectors.toList());

    }

    // 16. using "words" as input create a List containing all words ending in 'teen'
    private static List<String> task_16(List<String> words){
        return (List<String>) words.stream()
                .filter(word -> word.endsWith("teen"))
                .collect(Collectors.toList());

    }

    // 17. implement 15 and 16 using one method
    private static List<String> task_17(List<String> words, Predicate<String> pred ){
        return (List<String>) words.stream()
                .filter(pred)
                .collect(Collectors.toList());
    }

    // 18. using words as input create a Set of words with an odd number of letters
    private static Set<String> task_18(List<String> words){
        return (Set<String>) words.stream()
                .filter(word -> word.length() %2 != 0)
                .collect(Collectors.toSet());

    }

    // 19. using words as input create a Set containing the number of letters in a word
    private static Set<Integer> task_19(List<String> words){
        return (Set<Integer>) words.stream()
                .map(word -> word.length())
                .collect(Collectors.toSet());

    }

    // 20. convert the following code to java 8
    // nonJava8Method(numbers);
    private static void nonJava8Method(List<Integer> numbers) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = 0;

            if (numbers.get(i) % 2 == 0) {
                num = numbers.get(i) + 5;
            } else {
                sum += 0;
                continue;
            }

            num = num * 7;
            if (num % 20 == 3) {
                num = num / 20;
            }

            sum += (num / 10);

            if (++counter > 5) {
                break;
            }
        }

        System.out.println(sum);
    }

   //Java8Method(numbers);

  private static void Java8Method(List<Integer> numbers){
        Integer sum = numbers.stream()
                .limit(6)
                .filter(num->num %2 == 0)
                .map(num-> num+5)
                .map(num->num*7)
                .map( number -> {
                    if (number % 20 == 3)
                        number = number / 20;
                    return number;
                })
                .reduce(0,(acc,e)->acc+e+(e/10));
           System.out.println(sum);

    }



    // 21. using "numbers" as input print the first odd number that can be divided by 121, if it does not exist print -1
    private static void task_21(List<Integer> numbers){
        Integer result = numbers.stream()
                .filter(num-> num % 2 != 0)
                .filter(num-> num % 121 == 0)
                .findFirst()
                .orElse(-1);
        System.out.println(result);


    }


}
