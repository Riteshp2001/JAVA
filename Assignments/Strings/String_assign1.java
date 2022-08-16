package Strings;

public class String_assign1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter String and How many words you want to add:");
        int num = sc.nextInt()+1;
        String temp = "";
        while(num-- != 0){
            temp += sc.nextLine()+" ";
        }
        System.out.println("End String is :"+ temp);
    }
}
