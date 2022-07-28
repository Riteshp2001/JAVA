package Login_Inputs;


import java.util.Scanner;

class AgeExp extends Exception {//Creating class withg user defined Exception
    AgeExp(String a) {//creating parameterized Constructor
        System.out.println(a);
    }
}

public class Age_verification  {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);//crerating scanner class object
        System.out.print("Enter ur age :");
        int age = sc.nextInt();//user input

        try {//try block
            if(age < 18)//condition
                throw new AgeExp("Age is less than 18");
            else
                System.out.println("Valid age");
        }
        catch (AgeExp a) {//catch block
            System.out.println(a);
        }
    }
}
