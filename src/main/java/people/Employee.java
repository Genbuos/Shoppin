package people;

public abstract class Employee extends Customer implements Discountable{
    private final double discount = 0.10;

    public Employee(String name) {
        super(name);
    }

    public double getDiscount() {
        return discount;
    }

    public void printEmployeePriceAfterDiscount(Clothing clothing){

    }



}
