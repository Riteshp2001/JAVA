package Lab_Activities;

import java.util.Scanner;//calling package util with class Scanner
//Program to check if two number Sum exceeds 100 and Print new Exception using throw
public class Exception_AddNumbersUntil_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creating Scanner object
        System.out.print("Enter Starting number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Ending number: ");//taking input
        int num2 = sc.nextInt();
        int sum = num1+num2;
        if(sum>=100){
            throw new ArithmeticException("Limit EXCEEDED!!!");//compile time output as we are providing input rather than machine itself checking it
        }
        else {
            System.out.println(sum);//displaying end result
        }
    }
}
