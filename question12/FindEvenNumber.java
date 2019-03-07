package Questions.question12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEvenNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional optional=list.stream().filter((e)->e>3).filter((e)->e%2==0).findFirst();
        if(optional!=null){
            System.out.println("Even Value after 3 is : "+optional.get());
        }else
            System.out.println("value is not Present");
    }
}
