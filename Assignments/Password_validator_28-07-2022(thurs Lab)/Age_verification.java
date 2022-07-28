package Login_Inputs;


import java.util.Scanner;

class AgeExp extends Exception {
    AgeExp(String a) {
        System.out.println(a);
    }
}

public class Age_verification  {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur age :");
        int age = sc.nextInt();

        try {
            if(age < 18)
                throw new AgeExp("Age is less than 18");
            else
                System.out.println("Valid age");
        }
        catch (AgeExp a) {
            System.out.println(a);
        }
    }
}
