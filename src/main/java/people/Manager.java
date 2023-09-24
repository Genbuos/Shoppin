package people;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public double getDiscount() {
        return super.getDiscount() + 0.05;
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {
           double amountOff =  calculateDiscount(clothing);
           double priceAfterDiscount = clothing.getPrice() - amountOff;
        System.out.println(priceAfterDiscount);
    }


    @Override
    public double calculateDiscount(Clothing clothes) {
        return clothes.getPrice() * getDiscount();

    }
}
