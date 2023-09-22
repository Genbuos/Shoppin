package people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shop {


    public static double calculateTotal(Clothing[] clothing){
        double total = 0.0;
        for(Clothing clothe: clothing){
            double price =  clothe.getPrice();
            total += price;

        }
        return total;
    }

    public static boolean isAFit(Customer customer, Clothing clothing){
        if(customer.getSize() == clothing.getSize()){
            return true;
        }else {
            return false;
        }
    }

    public static  void printDiscountAmount(Discountable[] discountables, Clothing clothing){
        for(Discountable item: discountables){
            double discoountAmount = item.calculateDiscount(clothing);
            System.out.println("Discount for " + item.getClass().getSimpleName() + ": $" + discoountAmount);
        }
    }

    public static void sortAndPrintClothingItemsByPrice(ArrayList<Clothing> clothesList){
        Collections.sort(clothesList, new Comparator<Clothing>() {
            @Override
            public int compare(Clothing o1, Clothing o2) {
                double price1 = o1.getPrice();
                double price2 = o2.getPrice();
                if(price1 < price2){
                    return -1;
                } else if (price1 > price2) {
                    return 1;
                }else {
                    return 0;
                }

            }
        });

        for (Clothing clothing: clothesList){
            System.out.println("Item: " + clothing.getDescripton() + ", Price: $" + clothing.getPrice());
        }

    }
}
