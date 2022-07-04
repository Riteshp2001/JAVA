import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {

    public static Boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp != 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }
        if (n == sum) {
            return true;
        } else
            return false;

    }

    static int MinimumNo(int min, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int MaximumNo(int max, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int MaxsumArray(int arr[]) {
        int curr = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr > max) {
                max = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }
        return max;
    }

    static void reverseArray(int arr[]) {
        int curr = 0;
        int end = arr.length - 1;
        while (curr < end) {
            int temp = arr[curr];
            arr[curr] = arr[end];
            arr[end] = temp;
            curr++;
            end--;
        }
    }

    static int[] sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static char[] sortArrayChar(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static boolean duplicatesArray(int arr[]) {
        sortArray(arr);
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }

    static int chocolateDistribution(int arr[], int m) {
        // condition 1 : every student gets 1 minimum chocolate packet
        // here the array which is passed usme haar array element eek chocolate packet
        // define karta hai jese first elemnet hua 3 toh uss packet mei 3 chocolate hoga
        // and we have to give each packet to student such that sabse chota nikal ke
        // aaye minumum difference
        int diff = 0, min = arr[arr.length - 1];
        int len = arr.length;
        sortArray(arr);
        for (int i = 0; i <= len - m; i++) {
            diff = arr[i + m - 1] - arr[i];
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }

    static Boolean Anagram(char arr_1[], char arr_2[]) {
        sortArrayChar(arr_1);
        sortArrayChar(arr_2);

        if (arr_1.length != arr_2.length) {
            return false;
        }

        for (int i = 0; i < arr_1.length; i++) {
            if (arr_1[i] != arr_2[i]) {
                return false;
            }
        }
        return true;
    }

    static String removeConsecutive(String a) {
        if (a.length() <= 1) {
            return a;
        }
        if (a.charAt(0) == a.charAt(1)) {
            return removeConsecutive(a.substring(1));
        } else {
            return a.charAt(0) + removeConsecutive(a.substring(1));
        }
    }

    static String equivalentNumericKeypad(String str, String[] num) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                output += "0";
            } else {
                int pos = str.charAt(i) - 'A';
                output += num[pos];
            }
        }
        return output;
    }

    static String[] ArrayChecknegOrpos(int[] arr, int n){
        String[] ans = new String[n];
        for(int i =0;i<arr.length; i++) {
            if(arr[i]==0){
                ans[i]="Zero";
            }
            if (arr[i] > 0) {
                ans[i] = "Positive";
            }
            if (arr[i] < 0) {
                ans[i] = "Negative";
            }
        }
        return ans;
    }

    //Fibo using Dynamic Programming
    static private int[] array = new int[1000];
    static int fiboDP(int n) {
        if(array[n]<=1)return n;
        if(array[n]!=0)return array[n];
        else array[n] = fiboDP(n-1)+fiboDP(n-2);

        return array[n];
    }

    public static void main(String[] args) {
        // int num_1,num_2;

        // try (Scanner sc = new Scanner(System.in)) {
        // //getting input from user
        // System.out.println("enter first no: ");
        // num_1 = sc.nextInt();
        // System.out.println("Enter seconf Number : ");
        // num_2 = sc.nextInt();
        // }

        // //Performing Mathematical operations
        // System.out.println("added number is: "+(num_1+num_2));
        // System.out.println("subtracted number is: "+(num_1-num_2));
        // System.out.println("multiplied number is: "+(num_1*num_2));
        // System.out.println("divided number is: "+(num_1/num_2));
        // System.out.println("modulo number is: "+(num_1%num_2));
        // System.out.println("Power number is: "+Math.pow(num_2,num_1));

        // int a,b;
        // a=10;
        // b=20;

        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.printf("\n a=%d b=%d",a,b);

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter yor name");
        // String name = sc.nextLine();
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // System.out.println("Enter your Birthplace");
        // String place = sc.nextLine();

        // // Using Ternary operator
        // String output = ("Hello "+ name +" u are "+ age+ " from "+ place +
        // "congratulations ! u are adult now" );
        // System.out.println(output);

        // Palindromic number

        // System.out.print("Enter your range of Numbers: ");
        // int num_1 = sc.nextInt();

        // for (int i = num_1; i > 0; i--) {
        // int sum = 0;
        // int temp = i;
        // while (temp != 0) {
        // int r = Math.abs(temp % 10);
        // temp /= 10;
        // sum = (sum * 10) + r;
        // }
        // if (i == sum) {
        // System.out.print(i + " ");
        // }
        // }

        // //Palindromic string
        // String rev = "";
        // sc.nextLine();
        // System.out.println();
        // System.out.println("Enter the Words you want to check: ");
        // String Str_1 = sc.nextLine();
        // int len_Str = Str_1.length();
        // for (int j = len_Str - 1; j >= 0; j--) {
        // char ch = Str_1.charAt(j);
        // rev = rev + ch;
        // if (Str_1.equals(rev)) {
        // System.out.println("true");
        // }else{
        // System.out.print("false");
        // }
        // }

        // Armstromng number
        // System.out.println("Enter Armstrong number to check: ");
        // int arm_1 = sc.nextInt();

        // for(int i = 0;i<=arm_1;i++){
        // if(isArmstrong(i) == true){
        // System.out.println(i+",");
        // }
        // }

        // 1) Minimum and maximum number of Arrays
        // int count=0,arr[];
        // System.out.println("Enter the No of Elements in Arrays: ");
        // count = sc.nextInt();
        // arr = new int[count];
        // System.out.println("Enter the Array numbers to check: ");
        // for(int i = 0;i<count;i++){
        // arr[i] = sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++){
        // for(int j=i+1;j<arr.length;j++){
        // if(arr[i] > arr[j]){
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j]= temp;
        // }
        // }
        // }

        // System.out.println("Minimum and maximum number of Arrays are:
        // "+arr[0]+","+(arr[arr.length-1]));

        // 2) Maximum SUb-Array Kadene Algorithm

        // int count = 0, arr[];
        // System.out.println("Enter the No of Elements in Arrays: ");
        // count = sc.nextInt();
        // arr = new int[count];
        // System.out.println("Enter the Array Elements: ");
        // for (int i = 0; i < count; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Maximum subarray length is: "+ MaxsumArray(arr));

        // 3) Reversing Arrays
        // int count = 0, arr[];
        // System.out.println("Enter the No of Elements in Arrays: ");
        // count = sc.nextInt();
        // arr = new int[count];
        // System.out.println("Enter the Array elements: ");
        // for (int i = 0; i < count; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Original array is: ");
        // for(int i=0; i < count; i++){
        // System.out.print( arr[i]+" ");
        // }
        // System.out.println();

        // System.out.println("Reversed Array is: ");
        // reverseArray(arr);
        // for(int i=0; i < count; i++){
        // System.out.print(arr[i]+" ");

        // }

        // 4)Duplicates in Array

        // int count = 0, arr[];
        // System.out.println("Enter the No of Elements in Arrays: ");
        // count = sc.nextInt();
        // arr = new int[count];
        // System.out.println("Enter the Array elements: ");
        // for (int i = 0; i < count; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Array Contains duplicates?: "+duplicatesArray(arr));

        // 5) Chocolate Distribution Problem

        // int count = 0, arr[];
        // System.out.println("Enter the No of Elements in Arrays: ");
        // count = sc.nextInt();
        // arr = new int[count];
        // System.out.println("Enter the No of Chocolates in Packet: ");
        // for (int i = 0; i < count; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter Number of Students: ");
        // int student = sc.nextInt();

        // System.out.println("Minimun difference is : "+ chocolateDistribution(arr,
        // student));

        // 6) Anagram Strings (strings are just rearranged to previous string check if
        // strings are similar )

        // sorting approach

        // System.out.println("Enter a letter: ");
        // String letter =sc.nextLine();
        // char[] Str = letter.toCharArray();
        // System.out.println("Enter Anagram letter: ");
        // String letter1 = sc.nextLine();
        // char[] Str_1 = letter1.toCharArray();

        // System.out.println("Are the Letters Anagram? : "+ Anagram(Str,Str_1));

        // 7) Concecutive Characters removal(try)
        // aabb => ab

        // System.out.println("Enter the String elements: ");
        // String temp = sc.nextLine();
        // System.out.println("Output is: " + removeConsecutive(temp));

        // 8)Equivalent Numeric Keypad
        // z=9999,y=999,x=99,w=9...
        // String[] num = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5",
        // "55", "555", "6", "66", "666", "7",
        // "77", "777", "8", "88", "888", "9", "99", "999", "9999"};
        // System.out.println("Enter Alphabetical String: ");
        // String str = sc.nextLine();
        // str = str.toUpperCase();
        // System.out.print("Numeric Keypad is : " + equivalentNumericKeypad(str,num));

        /* ** Hashing Problems** */

        // 9) Similar string count

        // System.out.println("Enter your String: ");
        // String str = sc.nextLine();
        // char[] text = str.toCharArray();
        // HashMap<Character,Integer> s = new HashMap<Character,Integer>(str.length());
        // for(char i=0;i<text.length;i++){
        // if(s.containsKey(text[i])){
        // s.put(text[i],s.get(text[i])+1);
        // }else{
        // s.put(text[i],1);
        // }
        // for (Map.Entry m : s.entrySet()) {
        // if((int) m.getValue()>1){
        // System.out.println(m.getKey()+" "+m.getValue());
        // }
        // }
        // }

        // 10) two sum problem

        // System.out.println("Enter array count you want: ");
        // int count = sc.nextInt();
        // int[] arr = new int[count];
        // System.out.println("Array elements: ");
        // for (int i = 0; i < count; i++) {
        // arr[i] = sc.nextInt();
        // }

        // 11)Minimum difference

        // System.out.print("Enter positive number K: ");
        // int num_1 = sc.nextInt();
        // System.out.println("Enter array count you want: ");
        // int count = sc.nextInt();
        // int[] arr = new int[count];
        // for(int i =0;i<count;i++){
        // arr[i]= sc.nextInt();
        // }

        // int min = Integer.MAX_VALUE;
        // arr = sortArray(arr);
        // for(int i = 0; i<arr.length - num_1;i++){
        // min = Math.min(min, arr[i+num_1-1]-arr[i]);
        // }
        // System.out.println("Output: "+ min);



        //Recursions


        // String s1 = sc.nextLine();
        // int k = sc.nextInt();
        // char[] s2 = s1.toCharArray();
        // palindrome(s2,k,"");
        

        // int num = sc.nextInt();
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int x = sc.nextInt();
        // System.out.println(firstOccur(arr, 0, x));
        // System.out.println(isArmstrong(371));


        //Array Max no Operations K times

        // System.out.print("Enter positive number K: ");
        // int num_1 = sc.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(98);
        // arr.add(50);
        // arr.add(3);
        // arr.add(0);
        // arrayOperations(arr, num_1);
        // for(int i =0; i<arr.size(); i++){
        //     System.out.println(arr.get(i));
        // }


        //Count Common Factors

        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int count = 0;
        int max = Math.min(num, num1);
        for(int i =1; i< max;i++){
            if(i%num==0 && i%num1==0){
                count++;
            }
        }
        System.out.println(count);
    }

    static ArrayList<Integer> arrayOperations(ArrayList<Integer> arr,int k){
        while(k>0){
            int max = Collections.max(arr);
            for(int i =0 ; i < arr.size(); i++){
                arr.add(i, (max - arr.get(i)));
            }
            k--;
        }
        return arr;
    }

    static void palindrome(char[] arr, int k, String a) {
        if (k == 0) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            String str = a + arr[i];
            palindrome(arr, k - 1, str);
        }
    }

    public static int count7(int a){
        if(a < 1){
            return 0;
        }
        if(a%10 == 7){
            return (1 + count7(a/10));
        }else{
            return count7(a/10);
        }
    }

    public static int count8(int a) {
        if (a < 1) {
            return 0;
        }
        if (a % 10 == 8 && (a/10)%10 == 8) {
            return (2 + count8(a / 10));
        }if(a%10 == 8) {
            return (1 + count8(a / 10));
        }else{
            return count8(a/10);
        }
    }

    public static int countx(String a){
        if(a.equals("")){
            return 0;
        }
        if(a.charAt(0) == 'x'){
            return (1+ countx(a.substring(1)));
        }else{
           return countx(a.substring(1));
        }
    }
    public static int counthi(String a){
        if(a.length() == 0){
            return 0;
        }

        if(a.charAt(0) == 'h' && a.charAt(1) == 'i'){
            return (1 + counthi(a.substring(1)));
        } else {
            return counthi(a.substring(1));
        }
    }
    
    public static void zigzag(int n){
        if(n == 0){
            return ;
        }

        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
        zigzag(n-1);
        System.out.print(n);
    }

    public static int firstOccur(int[] arr,int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        for(int i =0; i < arr.length; i++){
            if(arr[idx] == x){
                return arr[idx];
            }
        }
        return firstOccur(arr, idx + 1, x);
    }

    public static int lastOccur(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        for (int i = arr.length; i > 0; i++) {
            if (arr[idx] == x) {
                return arr[idx];
            }
        }
        return lastOccur(arr, idx + 1, x);
    }


}
