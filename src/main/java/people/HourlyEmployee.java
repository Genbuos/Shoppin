package people;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing clothes) {
        double discountPercentage = getDiscount();

        double discountAmount = clothes.getPrice() * (discountPercentage / 100);

        return discountAmount;

    }
}
