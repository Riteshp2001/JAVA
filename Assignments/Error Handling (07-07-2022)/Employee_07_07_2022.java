package Lab_Activities;

import java.util.Scanner;

class Employee{
    String empname;//declaring variables
    double salary= 0;
}
class tempEmp extends Employee{
    private double hike;//setting hike variable as private coz it will only be handled by admin

    public double getHike() {
        return hike;
    }//using setter to input hike rate

    public void setHike(double hike) {
        this.hike = hike;
    }

    tempEmp(String empname, int salary){//using Parametrized Constructor
        this.empname = empname;
        this.salary = salary;
    }
    void show(){
        System.out.println(empname+" as you are temporary Employee you will get hike per annul as: "+hike+"x"+" i.e EXTRA salary=>"+hike*salary);
    }
}

class permEmp extends Employee{
    private double hike;//Comments same as tempEmp

    public double getHike() {
        return hike;
    }

    public void setHike(double hike) {
        this.hike = hike;
    }

    permEmp(String empname, int salary){
        this.empname = empname;
        this.salary = salary;
    }
    void show(){
        System.out.println(empname+" as you are our Permanent Employee you will get hike per annul as: "+hike+"x"+" i.e EXTRA salary=>"+(hike*salary));
    }
}

public class Employee_07_07_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();///taking name input
        System.out.print("Choose if you are Permanent(1) or Temporary Employee(2): ");//choosing if Perm Employee or otherwise.
        int choose = sc.nextInt();
        if(choose == 1){
            System.out.print("Enter Your Current Salary: ");//Displaying output
            int sal = sc.nextInt();
            permEmp p = new permEmp(name, sal);
            p.setHike(0.5);//setting hike rate
            p.show();
        }else if(choose == 2){
            System.out.print("Enter Your Current Salary: ");
            int sal = sc.nextInt();
            tempEmp t = new tempEmp(name, sal);
            t.setHike(0.3);
            t.show();
        }else{
            System.out.println("Error Choose Number As 1 or 2");//Error Handling
        }
    }
}
