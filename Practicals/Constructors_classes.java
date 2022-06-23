import java.util.Scanner;

public class Constructors_classes {

    public static void main(String[] args){
        Rect r = new Rect();
        Scanner sc = new Scanner(System.in);
        r.len = sc.nextInt();
        r.bre = sc.nextInt();
        r.rect(r.len,r.bre);


        Employee emp1 = new Employee();
        emp1.input();
        emp1.calculation();
        emp1.print_slip();
    }
}

class Rect{
    int len;
    int bre;

    public void rect( int n,int n1){
        System.out.println(n*n1);
    }

}

class Employee{
    String name;
    int id;
    double gross, hra, da, it, bp;
    Employee(){
        name = "";
        id = 0;
        gross = 0.0d;
        hra = 0.0d;
        it = 0.0d;
        bp =0.0d;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name : ");
        name = sc.nextLine();
        System.out.println("Enter Employee id: ");{
        id = sc.nextInt();
        System.out.println("Enter Employee Gross Salary: ");
        gross = sc.nextDouble();
        }
    }
    void calculation(){
        da = ((15/100)*gross);
        bp = ((8/100)*gross);
        it = ((5/100)*gross);
        hra = ((10/100)*gross);
    }

    void print_slip(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Employee Slip ...");
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Dearness Allowence is : "+da);
        System.out.println("Basic Pay is : "+bp);
        System.out.println("Income tax is : "+ it);
        System.out.println("Housing Rent Allowence is : "+hra);
        System.out.println("Gross Salary is : "+gross);
    }
}
