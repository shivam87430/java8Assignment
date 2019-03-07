package Questions.question5;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer consumer=(e)->System.out.println(e);
        consumer.accept(2);
    }
}
