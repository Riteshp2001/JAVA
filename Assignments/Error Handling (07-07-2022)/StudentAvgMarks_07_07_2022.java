package Lab_Activities;

import java.sql.SQLOutput;
import java.util.Scanner;

interface details{
    void name();
    void marks();
    void roll_no();
}

class Marksout implements details{
    Scanner sc = new Scanner(System.in);
    String name;
    int avg,roll;
    @Override
    public void name() {
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
    }

    @Override
    public void roll_no() {
        System.out.print("Enter your rollno: ");
        Scanner sc = new Scanner(System.in);
        roll = sc.nextInt();
    }
    @Override
    public void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many subjects marks you want to Enter: ");
        int count = sc.nextInt();
        int sum = 0;
        for(int i= 0;i<count;i++){
            System.out.println("Enter your "+(i+1)+" subject mark : ");
            int num = sc.nextInt();
            sum = sum+num;
        }
        avg = sum/5;
        System.out.println(name+"Your Average Marks of "+count+" subjects is: "+avg);
    }


}
public class StudentAvgMarks_07_07_2022 {
    public static void main(String[] args) {
        Marksout m = new Marksout();
        m.name();
        m.roll_no();
        m.marks();
    }
}
