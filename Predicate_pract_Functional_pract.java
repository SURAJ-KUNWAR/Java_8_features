import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Predicate_pract_Functional_pract {
    public static void main(String[] args) {
        // predicate -> boolean values function for checking some condition
        // Function -> accepts two types T, R input type and return type used for some operation
        // consume -> it doesnt return anything used for like save to database
        // supplier ->  its doesnt take anything in argument but it just return something
        // predicate is for checking
        Predicate<Integer> isEven = (x) -> x%2 == 0;
        Predicate<String> startsWithS = (s) -> s.toLowerCase().charAt(0) == 's';
        Predicate<String> endsWIthJ = (s) -> s.toLowerCase().charAt(s.length() -1) == 'j';
        Predicate<String> startsWithSandEndsWithJ = startsWithS.and(endsWIthJ);

        System.out.println(startsWithSandEndsWithJ.test("Suraj"));


        // Function is for some work
        Function<String , String> first3LetterFromString = (x) -> x.substring(0,3);
        Function<String , String> toUpperCase = (x) -> x.toUpperCase();

        System.out.println(first3LetterFromString.andThen(toUpperCase).apply("suraj"));

        //Consumer

        Consumer<List<Integer>> printN = (li) ->{
            for(int i : li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> printNPlusN = (li) -> {
            for(int i : li){
                System.out.println(i + 100);
            }
        };
        printN.accept(Arrays.asList(1,2,3,4));
        printNPlusN.accept(Arrays.asList(1,2,3,4));

        printNPlusN.andThen(printN).accept(Arrays.asList(4,3,2,1));


        //Supplier
        Supplier<Integer> give1 = () -> 1;
        System.out.println(give1.get());


        Predicate<Integer> isOdd = (x) -> x%2!=0;
        BiPredicate<Integer , Integer> isBiOdd = (x ,y) -> x%2!=0 &&y%2!=0;


        Function<String , Integer> strLen = (str) -> str.length();
        BiFunction<String , String , Integer> lenOf2String = (x ,y) -> x.length() + y.length();

        Consumer<String> print = (str) -> System.out.println(str);
        BiConsumer<String , String> print2Str = (str1 , str2) -> System.out.println(str1 + " " + str2);






    }
}
