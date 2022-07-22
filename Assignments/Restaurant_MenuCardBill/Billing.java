package Restaurant_MenuCardBill;

import java.util.Scanner;

class Billing extends Dinner {//Hierarchical Inheritence
    static String Billing_values = "";
    String[] billing_elements = new String[100];
    int bill_elem = 0;
    Scanner sc = new Scanner(System.in);
    private int Total_Bill = 0;

    void Breakfast_Billing() {
        String Billing_values = "";
        int[] breakfast_price = getMenu_elements_price_break();
        String[] breakfast_select = getMenu_elements_break();
        System.out.println("Choose Food you want we to Serve you in Breakfast Section (Select only numerical values)");
        breakfast_card();
        String option = sc.nextLine();
        while (!option.equals("x")) {
            int parsed_value = Integer.parseInt(option);
            if ((parsed_value - 1) > breakfast_select.length) {
                System.out.println("Please Select from given Food Lists!\n More Delicious Food On the Way in Future!!");
            }
            int num = breakfast_price[parsed_value - 1];
            System.out.println("Nice " + breakfast_select[parsed_value - 1] + " is added to your list");
            Total_Bill += num;
            Billing_values += breakfast_select[parsed_value - 1] + " --> " + breakfast_price[parsed_value - 1];
            billing_elements[bill_elem] = Billing_values;
            bill_elem++;
            Billing_values = "";
            System.out.println("More?");
            breakfast_card();
            System.out.println("Select Dish: ");
            option = sc.nextLine();
        }
    }

    void Lunch_Billing() {
        int[] lunch_price = getMenu_elements_price_lunch();
        String[] lunch_select = getMenu_elements_lunch();
        System.out.println("Choose Food you want we to Serve you in Lunch Section (Select only numerical values)");
        lunch_card();
        String option = sc.nextLine();
        while (!option.equals("x")) {
            int parsed_value = Integer.parseInt(option);
            if ((parsed_value - 1) > lunch_select.length) {
                System.out.println("Please Select from given Food Lists!\n More Delicious Food On the Way in Future!!");
            }
            int num = lunch_price[parsed_value - 1];
            System.out.println("Nice " + lunch_select[parsed_value - 1] + " is added to your list");
            Total_Bill += num;
            Billing_values += lunch_select[parsed_value - 1] + " --> " + lunch_price[parsed_value - 1];
            billing_elements[bill_elem] = Billing_values;
            bill_elem++;
            Billing_values = "";
            System.out.println("More?");
            lunch_card();
            System.out.println("Select Dish: ");
            option = sc.nextLine();
        }
    }

    void Dinner_Billing() {
        String Billing_values = "";
        int[] dinner_price = getMenu_elements_price_dinner();
        String[] dinner_select = getMenu_elements_dinner();
        System.out.println("Choose Food you want we to Serve you in Dinner Section (Select only numerical values)");
        dinner_card();
        String option = sc.nextLine();
        while (!option.equals("x")) {
            int parsed_value = Integer.parseInt(option);
            if ((parsed_value - 1) > dinner_select.length) {
                System.out.println("Please Select from given Food Lists!\n More Delicious Food On the Way in Future!!");
            }
            int num = dinner_price[parsed_value - 1];
            System.out.println("Nice " + dinner_select[parsed_value - 1] + " is added to your list");
            Total_Bill += num;
            Billing_values += dinner_select[parsed_value - 1] + " --> " + dinner_price[parsed_value - 1];
            billing_elements[bill_elem] = Billing_values;
            bill_elem++;
            Billing_values = "";
            System.out.println("More?");
            dinner_card();
            System.out.println("Select Dish: ");
            option = sc.nextLine();
        }
    }

    void End_Bill() {
        System.out.println("Thank You! For Choosing our Restaurant Here is your Bill :");
        for (int i = 0; i < billing_elements.length; i++) {
            if (billing_elements[i] == null) {
                break;
            }
            System.out.println(billing_elements[i]);
        }
        System.out.println("Total Bill : " + Total_Bill);
    }

}

