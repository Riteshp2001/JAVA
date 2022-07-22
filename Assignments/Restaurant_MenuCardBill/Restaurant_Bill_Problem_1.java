package Restaurant_MenuCardBill;

import java.util.Scanner;
//Not able to allocate Multiple food elements in single line in bill


public class Restaurant_Bill_Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String options;
        Menucard m = new Menucard();
        Billing b = new Billing();
        System.out.println("Welcome to Hotel Royale Enjoy our Stay and Eat Lots of Food :)");
        m.Menu();
        do {
            System.out.println("\n\nPlease Choose : \n1 -->  Breakfast Section \n2 -->  Lunch Section \n3 -->  Dinner Section\nX -->  Get Bill");
            options = sc.nextLine().toLowerCase();
            switch (options) {
                case "1" -> b.Breakfast_Billing();
                case "2" -> b.Lunch_Billing();
                case "3" -> b.Dinner_Billing();
                case "x" -> b.End_Bill();
            }
        } while (!options.equals("x"));
    }
}
