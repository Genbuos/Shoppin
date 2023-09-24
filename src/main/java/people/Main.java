package people;

import java.util.ArrayList;
import java.util.Arrays;

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

        swuidward.setClothingItems(hourlyEmployeeCart);
        swuidward.setSize(Size.M);
        System.out.println(Shop.isAFit(swuidward, hourlyEmployeeCart[0]));
        swuidward.printEmployeePriceAfterDiscount(hourlyEmployeeCart[1]);
        krabs.printEmployeePriceAfterDiscount(managerCart[1]);


        Clothing[] studentCart = {jeans, tShirt,buttonUp};

        Student jordy = new Student("Jordan");

        jordy.printPriceAfterDiscount(studentCart[1]);

        Customer.printCustomerName(jordy);
        Customer.printCustomerName(swuidward);
        Customer.printCustomerName(krabs);

        Clothing[] closet = {jeans,tShirt,buttonUp};
        ArrayList<Clothing> closetList = new ArrayList<>(Arrays.asList(closet));
        Shop.sortAndPrintClothingItemsByPrice(closetList);

        Discountable[] ppl = {jordy,swuidward, krabs};
        Shop.printDiscountAmount(ppl, buttonUp);



    }
}
