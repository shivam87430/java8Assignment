package Questions.question11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream().collect(Collectors.averagingInt(e->e*2)));
    }


}
