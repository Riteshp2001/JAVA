import java.util.Scanner;
public class Conditionl_Loops_Basic_Assign{
    // ### Basic Java Programs

    

// 1. Fibonacci Series In Java Programs
// 2. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
// 3. Input a number and print all the factors of that number (use loops).
// 4. Take integer inputs till the user enters 0 and print the sum of all numbers
// (HINT: while loop)
// 5. Take integer inputs till the user enters 0 and print the largest number from
// all.

    static void FiboLoop(int n) {
        // TODO Auto-generated method stub
        int n1 = 0;
        int n2 = 1;
        int i = 2;
        while(i==n){
            System.out.println(n1+",");
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            i++;
        }
    }

    static void ProductSubAdd(int n){
        int temp = n ;//variable declaration 
        int mul = 1;//variable initializing
        int add = 0;
        while(temp!=0){//looping until digit equals 0
            int rem = temp%10;//extacting last digit of integer
            mul*=rem;//multiplying with mul = 1;
            temp/=10;
        }
        while (temp != 0) {
            int rem = temp % 10;
            add += rem;
            temp /= 10;
        }
        System.out.println(mul-add);
    }

    static void infiniteAdd(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum!=Integer.MIN_VALUE){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            if (num == Integer.MAX_VALUE) {
                sum = Integer.MAX_VALUE;
                break;
            }
            sum = sum+num;
        }
        System.out.println(sum);
    }

    static void LargestInfiniteinp(){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(max!=Integer.MAX_VALUE){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n == Integer.MAX_VALUE){
                max = Integer.MAX_VALUE;
                break;
            }
            if(n>max){
                max = n;
            }
        }
        System.out.println(max);
    }

    static void PrimeFact(int n){

    }
    public static void main(String[] args) {
        LargestInfiniteinp();
    }
}