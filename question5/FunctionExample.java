package Questions.question5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> function=e->e+3;
        System.out.println(function.apply(1));
        }
    }

