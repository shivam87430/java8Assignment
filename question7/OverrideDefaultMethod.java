package Questions.question7;

interface MyJob{
    default void defaultMethod(){
        System.out.println("this is Default Method");
    }
}
public class OverrideDefaultMethod implements MyJob{
    public void defaultMethod(){
        System.out.println("this is class method");
    }
    public static void main(String[] args) {
        OverrideDefaultMethod overrideDefaultMethod=new OverrideDefaultMethod();
        overrideDefaultMethod.defaultMethod();
    }
}
