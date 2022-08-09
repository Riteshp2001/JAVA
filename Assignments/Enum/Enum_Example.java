package Enum;

import java.util.*;

enum Resturant{
    Breakfast("Papad", "Salad", "Coffee", "Ice Tea", "Poha"),
    Lunch("Roti", "Daal Tadka", "Rice", "Raita", "Paneer Tikka Masala", "Chilli Paneer", "Cold Drink"),
    Dinner("Naan", "Pizza", "Wine", "Roti", "Butter Chiken", "Cold Drink"),
    b_price(20, 25, 15, 22, 30),
    l_price(15, 65, 100, 25, 155, 135, 35),
    d_price(15, 65, 350, 25, 175, 35);

    String[] val ;
    int[] price;
    Resturant(String ...val){
        this.val = val;
    }
    Resturant(int ...price) {
        this.price = price;
    }

    public String[] get_val(){
        return this.val;
    }

    public int[] get_price(){
        return this.price;
    }
}
public class Enum_Example {
    public static void main(String[] args) {
        int bal = 0;
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        Resturant[] menu = Resturant.values();
        String options;
        do {
            System.out.println("\nPlease Choose : \n1 -->  Breakfast Section \n2 -->  Lunch Section \n3 -->  Dinner Section\nX -->  Exit");
            options = sc.nextLine().toLowerCase();
            if(options.equals("1")){
                String[] breakfast = menu[0].get_val();
                int[] breakfast_val = menu[3].get_price();
                for (int i =0;i< breakfast.length;i++) {
                    System.out.println((i+1)+" :" + breakfast[i] +"-->"+breakfast_val[i]);
                }
                System.out.println("choose from option above :");
                int i;
                while(true){
                    String x = sc.nextLine();
                    if(x.equals("no")){
                        break;
                    }
                    if(Arrays.asList(breakfast).contains(x)){
                        for(i =0;i< breakfast_val.length;i++){
                            if(x.equals(breakfast[i])){
                                bal += breakfast_val[i];
                                map.put(x,breakfast_val[i]);
                                break;
                            }
                        }
                    }else{
                        System.out.println("Please Choose from Given Options !");
                    }
                    System.out.println("Need More?");
                }
            } else if (options.equals("2")){
                String[] lunch = menu[1].get_val();
                int[] lunch_val = menu[4].get_price();
                for (int i =0;i< lunch.length;i++) {
                    System.out.println((i+1)+" :" + lunch[i] +"-->"+lunch_val[i]);
                }
                System.out.println("choose from option above :");
                int i;
                while(true){
                    String x = sc.nextLine();
                    if(x.equals("no")){
                        break;
                    }
                    if(Arrays.asList(lunch).contains(x)){
                        for(i =0;i< lunch_val.length;i++){
                            if(x.equals(lunch[i])){
                                bal += lunch_val[i];
                                map.put(x,lunch_val[i]);
                                break;
                            }
                        }
                    }else{
                        System.out.println("Please Choose from Given Options !");
                    }
                    System.out.println("Need More?");
                }
            } else if (options.equals("3")){
                String[] dinner = menu[2].get_val();
                int[] dinner_val = menu[5].get_price();
                for (int i =0;i< dinner.length;i++) {
                    System.out.println((i+1)+" :" + dinner[i] +"-->"+dinner_val[i]);
                }
                System.out.println("choose from option above :");
                int i;
                while(true){
                    String x = sc.nextLine();
                    if(x.equals("no")){
                        break;
                    }
                    if(Arrays.asList(dinner).contains(x)){
                        for(i =0;i< dinner_val.length;i++){
                            if(x.equals(dinner[i])){
                                bal += dinner_val[i];
                                map.put(x,dinner_val[i]);
                                break;
                            }
                        }
                    }else{
                        System.out.println("Please Choose from Given Options !");
                    }
                    System.out.println("Need More?");
                }
            } else if (options.equals("x")) {
                int i =1;
                for(Map.Entry<String,Integer>e: map.entrySet()){
                    System.out.println(i+" "+e.getKey()+" --> "+e.getValue());
                    i++;
                }
                System.out.println("Total Bill is : "+bal);
            } else{
                System.out.println("Wrong option Choose from options mentioned earlier !");
            }
        } while (!options.equals("x"));
    }
}
