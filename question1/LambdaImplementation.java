package Questions.question1;
interface CheckNumber{
    boolean greatestNumber(int a,int b);
}

interface IncrementNumber{
    int incrementedNumberBy1(int a);
}

interface ConcatString{
    String concatedString(String str1,String str2);
}

interface ToUppercase{
    String stringToUppercase(String str);
}
public class LambdaImplementation {
    public static void main(String[] args) {
        CheckNumber checkNumber=(a,b)-> (a>b)?true : false;
        IncrementNumber incrementNumber=(a)->a+1;
        ConcatString concatString=(a,b)->a+b;
        ToUppercase toUppercase=(a)->a.toUpperCase();
        System.out.println("First Number is greatest Number or not --->"+checkNumber.greatestNumber(3,2));
        System.out.println("Increment 4 by 1 "+incrementNumber.incrementedNumberBy1(4));
        System.out.println("Concated String is "+concatString.concatedString("Shivam","Saxena"));
        System.out.println("Uppercase String is "+toUppercase.stringToUppercase("shivam"));
    }
}
