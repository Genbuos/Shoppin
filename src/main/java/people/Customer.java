package people;

public abstract class Customer extends  Person{

    public Customer(String name) {
        super(name);
    }

    public static void printCustomerName(Customer customer){
        System.out.println(customer.getName());
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}
