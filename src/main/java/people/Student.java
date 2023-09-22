package people;

public class Student extends Customer implements Discountable{
    private long studentId;
    private final double discount = 0.5;
    public Student(String name) {
        super(name);
    }

    @Override
    public double calculateDiscount(Clothing clothes) {
        return 0;
    }
}
