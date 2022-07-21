package Restaurant_MenuCardBill;

import java.util.Scanner;

//Error: Not able to print elements Showing Null in bill rest all correct
//Not able to allocate Multiple food elements in single line in bill

class Breakfast{
    private String[] menu_elements_break = {"Papad","Salad","Coffee","Ice Tea","Poha"};
    private int[] menu_elements_price_break = {20,25,15,22,30};

    public String[] getMenu_elements_break() {
        return menu_elements_break;
    }

    public int[] getMenu_elements_price_break() {
        return menu_elements_price_break;
    }

    void breakfast_card(){
        System.out.println("Dishes for Breakfast");
        for(int i = 0;i<menu_elements_break.length;i++){
            for(int j =i;j<=i;j++){
                System.out.println(i+1+") "+menu_elements_break[i]+"-->"+menu_elements_price_break[i]);
            }
        }
    }
}

class Lunch extends Breakfast{
    private String[] menu_elements_lunch = {"Roti","Daal Tadka","Rice","Raita","Paneer Tikka Masala","Chilli Paneer","Cold Drink"};
    private int[] menu_elements_price_lunch = {15,65,100,25,155,135,35};

    public String[] getMenu_elements_lunch() {
        return menu_elements_lunch;
    }

    public int[] getMenu_elements_price_lunch() {
        return menu_elements_price_lunch;
    }

    void lunch_card(){
        System.out.println("Dishes for Lunch");
        for(int i = 0;i<menu_elements_lunch.length;i++){
            for(int j =i;j<=i;j++){
                System.out.println(i+1+") "+menu_elements_lunch[i]+"-->"+menu_elements_price_lunch[i]);
            }
        }
    }
}

class Dinner extends Lunch{
    private String[] menu_elements_dinner = {"Naan","Pizza","Wine","Roti","Butter Chiken","Cold Drink"};
    private int[] menu_elements_price_dinner = {15,65,350,25,175,35};

    public String[] getMenu_elements_dinner() {
        return menu_elements_dinner;
    }

    public int[] getMenu_elements_price_dinner() {
        return menu_elements_price_dinner;
    }

    void dinner_card(){
        System.out.println("Dishes for Dinner");
        for(int i = 0;i<menu_elements_dinner.length;i++){
            for(int j =i;j<=i;j++){
                System.out.println(i+1+") "+menu_elements_dinner[i]+"-->"+menu_elements_price_dinner[i]);
            }
        }
    }
}

class Menucard extends Dinner{//multilevel Inheritance
    void Menu(){
        breakfast_card();
        lunch_card();
        dinner_card();
    }
}

class Billing extends Dinner {//Hierarchical Inheritence
    String[] billing_elements = new String[100];
    private int Total_Bill = 0;
    int bill_elem = 0;
    Scanner sc = new Scanner(System.in);

    public void setTotal_Bill(int total_Bill) {
        Total_Bill = total_Bill;
    }

    public int getTotal_Bill() {
        return Total_Bill;
    }

    void Breakfast_Billing() {
        String Billing_values="temp";
        int[] breakfast_price = getMenu_elements_price_break();
        String[] breakfast_select = getMenu_elements_break();
        System.out.println("Choose Food you want we to Serve you in Breakfast Section (Select only numerical values)");
        breakfast_card();
        String option = sc.nextLine();
        while(!option.equals("x")){
            int parsed_value = Integer.parseInt(option);
            if((parsed_value-1)>breakfast_select.length){
                System.out.println("Please Select from given Food Lists!\n More Delicious Food On the Way in Future!!");
            }
            int num = breakfast_price[parsed_value-1];
            System.out.println("Nice "+breakfast_select[parsed_value-1] +" is added to your list");
            setTotal_Bill(Total_Bill+num);
            Billing_values += breakfast_select[parsed_value-1]+"-->"+ breakfast_price[parsed_value-1];
            billing_elements[bill_elem]=Billing_values;
            bill_elem++;
            System.out.println("More?");
            breakfast_card();
            System.out.println("Select Dish: ");
            option = sc.nextLine();
        }
    }

    void Lunch_Billing() {
        String Billing_values="";
        int[] lunch_price = getMenu_elements_price_lunch();
        String[] lunch_select = getMenu_elements_lunch();
        System.out.println("Choose Food you want we to Serve you in Lunch Section (Select only numerical values)");
        lunch_card();
        String option = sc.nextLine();
        while(!option.equals("x")){
            int parsed_value = Integer.parseInt(option);
            if((parsed_value-1)>lunch_select.length){
                System.out.println("Please Select from given Food Lists!\n More Delicious Food On the Way in Future!!");
            }
            int num = lunch_price[parsed_value-1];
            System.out.println("Nice "+lunch_select[parsed_value-1]+" is added to your list");
            setTotal_Bill(Total_Bill+num);
            Billing_values += lunch_select[parsed_value-1]+"-->"+ lunch_price[parsed_value-1];
            billing_elements[bill_elem]=Billing_values;
            bill_elem++;
            Billing_values="";
            System.out.println("More?");
            lunch_card();
            System.out.println("Select Dish: ");
            option = sc.nextLine();
        }
    }

    void Dinner_Billing() {
        String Billing_values="";
        int[] dinner_price = getMenu_elements_price_dinner();
        String[] dinner_select = getMenu_elements_dinner();
        System.out.println("Choose Food you want we to Serve you in Dinner Section (Select only numerical values)");
        dinner_card();
        String option = sc.nextLine();
        while(!option.equals("x")){
            int parsed_value = Integer.parseInt(option);
            if((parsed_value-1)>dinner_select.length){
                System.out.println("Please Select from given Food Lists!\n More Delicious Food On the Way in Future!!");
            }
            int num = dinner_price[parsed_value-1];
            System.out.println("Nice "+dinner_select[parsed_value-1]+" is added to your list");
            setTotal_Bill(Total_Bill+num);
            Billing_values += dinner_select[parsed_value-1]+"-->"+ dinner_price[parsed_value-1];
            billing_elements[bill_elem]=Billing_values;
            bill_elem++;
            Billing_values="";
            System.out.println("More?");
            dinner_card();
            System.out.println("Select Dish: ");
            option = sc.nextLine();
        }
    }

    void End_Bill(){
        System.out.println("Thank You! For Choosing our Restaurant Here is your Bill :");
        for(int i =0;i<billing_elements.length;i++) {
            if(billing_elements[i]==null){
                break;
            }
            System.out.println(billing_elements[bill_elem]);
        }
        System.out.println("Total Bill : "+getTotal_Bill());
    }

}


public class Restaurant_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String options;
        Menucard m = new Menucard();
        Billing b = new Billing();
        System.out.println("Welcome to Hotel Royale Enjoy our Stay and Eat Lots of Food :)");
        do{
            m.Menu();
            System.out.println("\n\nPlease Choose : \n1 -->  Breakfast Section \n2 -->  Lunch Section \n3 -->  Dinner Section\nX -->  Get Bill");
            options = sc.nextLine().toLowerCase();
            switch (options) {
                case "1" -> b.Breakfast_Billing();
                case "2" -> b.Lunch_Billing();
                case "3" -> b.Dinner_Billing();
                case "x" -> b.End_Bill();
            }
        }while(!options.equals("x"));
    }
}
