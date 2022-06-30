import java.util.Scanner;

public class Lab_exp_1 {
    
    public static void main(String[] args) {
        //Code starts here~ 
        Bike b = new Bike();
        b.input();
        b.compute();
        b.disp();
    }   
}

class Bike{//creating class
    String b_no , c_name;//declaring variables
    int days,rent,charge;
    Bike(){//initialization
        b_no = "";
        c_name = "";
        days= 0;
        rent = 0;
        charge = 0;
    }
    void input(){//taking inputs From user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of Customer : ");
        c_name=sc.nextLine();
        System.out.print("Enter Bike Number: ");
        b_no=sc.nextLine();
        System.out.print("Enter Number of Days you want to take Bike : ");
        days = sc.nextInt();
    }
    void compute(){//calculating rent by taking Days as an input
        for(int i = 0; i < days; i++){
            if(i<=5){
                rent+=100;
            }else if(i<=10){
                rent+=400;
            }else{
                rent+=200;
            }
        }
    }
    void disp(){//displaying All the taken input and calculation
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Customer Name "+ c_name);
        System.out.println(c_name+" Bike ID: " +b_no );
        System.out.println("Number of days  : " +days);
        System.out.println("Charge : "+rent);
    }
}
