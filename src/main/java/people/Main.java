package people;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
        Clothing tShirt = new Clothing("White T Shirt", 5.0,Size.S);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);

        Clothing[] managerCart = {jeans, tShirt, buttonUp};

        Manager krabs = new Manager("Euguene");
        krabs.setClothingItems(managerCart);

        Clothing[] hourlyEmployeeCart = {jeans, tShirt, buttonUp};

        HourlyEmployee swuidward = new HourlyEmployee("Squidward");
        System.out.println(Shop.calculateTotal(managerCart));

    }
}
