package people;

public class Student extends Customer implements Discountable{
    private long studentId;
    private final double discount = 0.5;
    public Student(String name) {
        super(name);
    }



public void printPriceAfterDiscount(Clothing clothing){
    double amountOff =  calculateDiscount(clothing);
    double priceAfterDiscount = clothing.getPrice() - amountOff;
    System.out.println(priceAfterDiscount);
}
    @Override
    public double calculateDiscount(Clothing clothes) {
        return clothes.getPrice() * discount;
    }
}
