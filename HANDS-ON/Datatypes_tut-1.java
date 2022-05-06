import java.utils.Scanner

public class Practice {
    public static void main(String[] args) {
       int num_1,num_2;
       // num_1 = 23;
       // num_2 = 32;
        
        Scanner sc = new Scanner(System.in); 

        //getting input from user
        System.out.println("enter first no: ");
        num_1 = sc.nextInt();
         System.out.println("Enter seconf Number : ");
        num_2 = sc.nextInt();
  
        //by using Scanner utils in java !
        System.out.println("added number is: "+(num_1+num_2));
        System.out.println("subtracted number is: "+(num_1-num_2));
        System.out.println("multiplied number is: "+(num_1*num_2));
        System.out.println("divided number is: "+(num_1/num_2));
        System.out.println("modulo number is: "+(num_1%num_2));
        System.out.println("Power number is: "+Math.pow(num_2,num_1));
    }
}
