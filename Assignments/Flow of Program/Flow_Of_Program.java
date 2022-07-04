import java.util.Scanner;

public class Flow_Of_Program {
    // Problems to do in Order

// 1. Input a year and find whether it is a leap year or not.
// 2. Take two numbers and print the sum of both.
// 3. Take a number as input and print the multiplication table for it.
// 4. Take 2 numbers as inputs and find their HCF and LCM.
// 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

//1)
static boolean isLeapYear(int year) {
    if(year % 4 == 0 || year % 100 != 0 || year % 400 == 0) return true;//a year is only leap year of its centuary is divisible by 400 and not by every 1 (i.e 100 years)
    else return false;
}

//2) 
static int sum(int a, int b){
    return a+b;
}

//3)
static void PrintMultiplication(int a){
    int i = 1;
    while(i < 11){//base condition when i have to stop while loop here i have to print muliplication table so traditional way is tabling upto 10
        System.out.println(a*i);//prining numbers uptil "i" is 10
        i++;//incrementing i everytime we print number
    }
}

//4)
static void HCF_LCM(int num, int num2){
    int a = num;
    int b = num2;
    if (a == 0)
        System.out.println("HCF is "+b);
    else if (b == 0)
        System.out.println("HCF is " +a);
    while (a != b) {
        // if (a > b)
        //     a = a - b;
        // else
        //     b = b - a;
        //or
        int temp = a;
        a = a%b;
        b = temp;
    }
    System.out.println("HCF is " +a);

    int lcm = (num*num2)/a;
    System.out.println("LCM is "+lcm);

}

//5)
static void Takeinput(){
    int sum = 0;
    int i=0;
    String temp = "";
    Scanner sc = new Scanner(System.in);
    while(!temp.equals("x")){//checking if number is equals to the x or not
        System.out.println("Enter a number or else x to quit: ");
        temp = sc.nextLine();//taking number as a string input

        if(!temp.equals("x")){//again checking if number is equals to x or not
            i = Integer.parseInt(temp); //ting that string number int integer number
            sum = sum + i;
        }
    }
    System.out.println("Your total count is "+sum);//printing sum of all taken inputs
}


public static void main(String[] args) {
   Takeinput();
}

}
