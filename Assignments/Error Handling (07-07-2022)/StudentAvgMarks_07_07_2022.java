package Lab_Activities;

//Java Program to Display Average Marks of Subjects
import java.util.Scanner;

interface details{
    void name();
    void marks();
    void roll_no();//declaring methods
}

class Marksout implements details{
    Scanner sc = new Scanner(System.in);
    String name;
    int avg,roll;//declaring variables
    @Override
    public void name() {
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();//taking name input
    }

    @Override
    public void roll_no() {
        System.out.print("Enter your rollno: ");
        Scanner sc = new Scanner(System.in);
        roll = sc.nextInt();//taking roll number input
    }
    @Override
    public void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many subjects marks you want to Enter: ");
        int count = sc.nextInt();
        int sum = 0;//initializing variable
        for(int i= 0;i<count;i++){//looping through subjects and storing each marks in sum variable
            System.out.println("Enter your "+(i+1)+" subject mark : ");
            int num = sc.nextInt();
            sum = sum+num;
        }
        avg = sum/count;//calculating Average
        System.out.println(name+"Your Average Marks of "+count+" subjects is: "+avg);//displaying average
    }


}
public class StudentAvgMarks_07_07_2022 {
    public static void main(String[] args) {
        Marksout m = new Marksout();//creating Object of Class MarkOut
        m.name();
        m.roll_no();
        m.marks();//calling functions
    }
}
