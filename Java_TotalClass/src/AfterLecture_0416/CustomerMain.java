package AfterLecture_0416;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1  = new Customer("곽효재", 29, 10000000, true);
        customer1.printCustomerInfo();

        Customer customer2 = new Customer();
        customer2.printCustomerInfo();
    }
}
