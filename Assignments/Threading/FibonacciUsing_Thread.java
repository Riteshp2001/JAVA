package Threading;

import java.util.Scanner;

class Fibo extends Thread{
    int num;

    Fibo(int n){
        this.num = n;
    }
    public void run(){
        int i = 0;
        int j = 1;
        System.out.print(i+","+j);
        while(num!=0){
            int fibonacci = i+j;
            i= j;
            j = fibonacci;
            System.out.print(","+fibonacci);
            num--;
        }
    }
}

class Reversenum extends Thread{
    int num;

    Reversenum(int n){
        this.num = n;
    }
    public void run(){
        while(num!=0){
            System.out.print(num--+" ");
        }
    }
}

public class FibonacciUsing_Thread {
    public static void main(String[] args) {
//        System.out.print("Enter How many Fibonacci Numbers?: ");
//        Fibo f = new Fibo(new Scanner(System.in).nextInt());
        System.out.print("Enter How many Numbers?: ");
        Reversenum r = new Reversenum(new Scanner(System.in).nextInt());
        r.start();

    }
}
