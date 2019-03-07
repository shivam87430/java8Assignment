package Questions.question3;

import Questions.question2.FunctionalInterfaceExample;

public class MethodReferenceExample {
    int add(int a,int b){
        return(a+b);
    }
    int sub(int a, int b){
        return a-b;
    }
    static int multiply(int z,int q){
        return z*q;
    }
    public static void main(String[] args) {
        FunctionalInterfaceExample myjob=MethodReferenceExample::multiply;
        int mul=myjob.performOperation(2,4);
        System.out.println("multiply of 2 and 4 is : "+mul);
        FunctionalInterfaceExample instancemethod=new MethodReferenceExample()::add;
        int addition=instancemethod.performOperation(1,2);
        System.out.println("Addition of 1 and 2 is : "+addition);
        FunctionalInterfaceExample instancemethodadd=new MethodReferenceExample()::sub;
        int substract=instancemethodadd.performOperation(23,2);
        System.out.println("Substraction of 23 and 2 is : "+substract);
    }
}

