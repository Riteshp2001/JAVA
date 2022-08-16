package Strings;

import java.util.Scanner;

public class remove_all_charOccur {
    public static void Com()
    {
        String n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String :");
        n1=sc.nextLine();
        System.out.println("Enter your Character :");
        n2 = sc.next();
        repall(n1,n2);
    }
    public static void repall(String val,String charval)
    {
        String exp=val;
        String newval=val.replaceAll(exp,charval);
        System.out.println("new String is : "+newval);


    }

    public static void main(String[] args) {
        Com();
    }
}
