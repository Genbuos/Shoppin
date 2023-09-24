package people;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(String name) {
        super(name);
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
