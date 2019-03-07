package Questions.question5;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier supplier=()->10;
        System.out.println(supplier.get());
    }

}
