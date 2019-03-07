package Questions.question5;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate=(e)-> e%2==0;
        System.out.println(predicate.test(12));
    }
}
