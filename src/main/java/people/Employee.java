package people;

public abstract class Employee extends Customer implements Discountable{
    private final double discount = 0.10;

    public Employee(String name) {
        super(name);
    }

    public double getDiscount() {
        return discount;
    }

    //using an array can be better to get the total price of the  array of clothing and calculate the
    //discount also retunrning a double because our price are doubles
    public abstract void printEmployeePriceAfterDiscount(Clothing clothing);





}
