package Testing;

import java.util.Scanner;

interface Bank{
    void bankName();//declaring data function prototype in interface
}

class Customer implements Bank{
    private final String name ;
    String b_name;
    float r;//taking input as customer name ,bank name and rate of interest in each bank
    Customer(){
        name = "";
        r = 0;
    }
    Customer(String b_name,String name){
        this.b_name=b_name;
        this.name=name;
    }
    public void bankName(){
        if(b_name.equals("SBI")){//comparing if bank name inputted is equals to the SBI or PNB or ICICI and giving output as per input given
            r = (float)1.34;//typecasting float integer
            System.out.println(name+" your "+b_name+" rate of interest is "+r);
        }else if(b_name.equals("ICICI")){
            r = (float)2.13;
            System.out.println(name+" your "+b_name+" rate of interest is "+r);
        }else if(b_name.equals("PNB")){
            r = (float)0.894;
            System.out.println(name+" your "+b_name+" rate of interest is "+r);
        }else{
            System.out.println("Error Please input bank names From List: ICICI,PNB,SBI");//ERROR Handling
        }
    }

}
public class Interface_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String a = sc.nextLine();
        System.out.print("Enter Your Bank name to check Interest rate: ");
        String b = sc.nextLine();
        b = b.toUpperCase();//converting every string input to Capital letters
        Customer c = new Customer(b,a);//creating object for class customer
        c.bankName();
    }
}
