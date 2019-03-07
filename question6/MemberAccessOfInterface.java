package Questions.question6;

import Questions.question3.MethodReferenceExample;

interface OperationPerform{
    static void staticMember(){
        System.out.println("this is a static method");
    }

    default void defaultMethod(){
        System.out.println("Default Method");
    }
}
public class MemberAccessOfInterface implements OperationPerform {
    public static void main(String[] args) {
        OperationPerform.staticMember();
        MemberAccessOfInterface memberAccessOfInterface=new MemberAccessOfInterface();
        memberAccessOfInterface.defaultMethod();
    }
}
