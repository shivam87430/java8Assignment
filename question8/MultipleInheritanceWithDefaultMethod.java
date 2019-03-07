package Questions.question8;

interface Parent {
    default void defaultMethod() {
        System.out.println("Parent");
    }
}

interface child1 extends Parent {
    default void defaultMethod() {
        System.out.println("child1");
    }
}

interface child2 extends Parent{
    default void defaultMethod() {
        System.out.println("child2");
    }
}


public class MultipleInheritanceWithDefaultMethod implements child1, child2 {
    @Override
    public void defaultMethod() {
        child1.super.defaultMethod();
        System.out.println("this is class default Method");
    }
    public static void main(String[] args) {
        MultipleInheritanceWithDefaultMethod multipleInheritanceWithDefaultMethod = new MultipleInheritanceWithDefaultMethod();
        multipleInheritanceWithDefaultMethod.defaultMethod();
    }
}
