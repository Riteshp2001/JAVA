package Restaurant_MenuCardBill;

import java.util.Scanner;

public class Array_calc_Problem_2 {
    static int[] arr;
    static Scanner sc = new Scanner(System.in);
    static void input_arr(){
        int count=0;
        System.out.println("Enter the No of Elements in Arrays: ");
        count = sc.nextInt();
        arr = new int[count];
        System.out.println("Enter the Array numbers to Calculate: ");
        for(int i = 0;i<count;i++){
            arr[i] = sc.nextInt();
        }
    }

    static void Average(){
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Average is :"+(sum/arr.length));
    }

    static void Ascending(){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    static void Descending(){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    static void Print(){
        for(int i =0;i<arr.length;i++){
            System.out.println((i+1)+" Element is "+arr[i]);
        }
    }

    public static void main(String[] args) {
        input_arr();
        Descending();
        Print();
    }
}
