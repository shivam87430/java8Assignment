package Questions.question4;

@FunctionalInterface
interface GetEmployee{
    Employee getEmployeeInfo(String name,Integer age,String city);
}
public class Employee {
    String name;
    Integer age;
    String city;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public Employee(String n, Integer a, String c){
        this.name=n;
        this.age=a;
        this.city=c;
    }

    public static void main(String[] args) {
        GetEmployee getEmployee= Employee::new;
        System.out.println(getEmployee.getEmployeeInfo("Shivam",21,"Agra"));
    }

}


