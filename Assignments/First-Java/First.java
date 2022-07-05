import java.util.Scanner;

public class First {

//Programs to do

// 1. Write a program to print whether a number is even or odd, also take
// input from the user.
// 2. Take name as input and print a greeting message for that particular name.
// 3. Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.
// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)
// 5. Take 2 numbers as input and print the largest number.
// 6. Input currency in rupees and output in USD.
// 7. To calculate Fibonacci Series up to n numbers.
// 8. To find out whether the given String is Palindrome or not.
// 9. To find Armstrong Number between two given number.

static Scanner sc = new Scanner(System.in);

//1)
static void OddEven(){
    if((sc.nextInt()&1) == 1){//using bitwise operator AND if the last bit is set then number is odd 
        System.out.println("Number is odd.");
    }else {
        System.out.println("Number is even.");
    }
}

//2)
static void greet(){
    String name = sc.nextLine();//using scanner class to take input
    System.out.println("Hello " + name+" how are you :)");
}

//3)
static void SimpleIntrest(){
    int principal = sc.nextInt();
    int time = sc.nextInt();
    float rate = sc.nextFloat();

    float SI = (principal*rate*time)/100;
    System.out.println("SimpleIntrest id : "+ SI);
}

//4)
static void calculate(int a, int b){
    System.out.println("Select Operator: *,/,-,+");
    String inp = sc.nextLine();
    if(inp.equals("+")){//if the input is one of these character then print out the operation
        System.out.println(a+b);
    }
    if(inp.equals("_")){
        System.out.println(a - b);
    }
    if (inp.equals("*")) {
        System.out.println(a * b);
    }
    if (inp.equals("/")) {
        System.out.println(a / b);
    }else{
        System.out.println("Sorry Select one of the given Choices");//error handeling if input is none of above
    }
}

//5)
static void largest(int a, int b){
    System.out.println("Largest of " + a +" and " + b +" is " + Math.max(a, b));//using math.max function to calcilate largest 
    //we can do it using if and else statement too ...
}

//6)
static void RstoUS(double a){
    //Not Yet Studied Java.currency ; Skipping!! will complete later
}

//7)
static void Fibo(int a){
    int first = 0;
    int second = 1;//initializing first 2 fibo series for further calculation
    for(int i =0;i<a;i++){//looping until given num
        System.out.print(first+",");
        int temp = first + second;//adding first and second number for third number
        first = second;
        second = temp;
    }
}

//8)
static boolean Palindrome(String a){
    String x = "";

    for(int i =a.length()-1;i>=0;i--){//looping from the end of string to first
        x += a.charAt(i);//adding each character in string x
    }
    if(x.equals(a)){//checking if reversed string is equals to the given string
        return true;
    }
    return false;
}

//9)
static void Armstrong(int a, int b){
    if(a>b){//checking if a is smaller then b
        a = a^b;//if yes then swapping a and b
        b = a^b;
        a = a^b;
    }
    for(int i =a;i<b;i++){//lloping through given range a and b and checking if numbers are armstrong at "i'th" positiion
        int temp = 0,digits =0;
        double sum =0;
        temp = i;
        while(temp!=0){
            temp/=10;
            digits++;
        }
        temp = i;
        while(temp!=0){
            int rem=temp%10;
            sum = sum + Math.pow(rem,digits);
            temp/=10;
        }

        if(sum == i){
            System.out.print(i+" ");
        }
    }
}

public static void main(String[] args) {
    // OddEven();
    // greet();
    // Fibo(10);
    // System.out.println(Palindrome("abcba"));
    Armstrong(100, 2000);
}
}
