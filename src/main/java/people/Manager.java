package people;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing clothes) {
        double discountPercentage = getDiscount() + 0.5;

        double discountAmount = clothes.getPrice() * (discountPercentage / 100);

        return discountAmount;
    }
}
