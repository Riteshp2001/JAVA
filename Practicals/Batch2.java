import java.util.Scanner;

//Calling one Class with Another Class using This keyword

class test2{
    static int y = 6;
    test x;
    test2(test x){
        System.out.println(x.h);
        x.calc(x.h,y);
        this.disp();
    }
    void disp(){
        System.out.println("hello");
    }
}

class test {
    int h = 67;
    Batch2 t1;
    test(Batch2 t1){
        t1.solve(12,25);
        System.out.println(t1.a);
        test2 n = new test2(this);
    }

    void calc(int h , int y){
        System.out.println(h*y);
    }
}


public class Batch2 {
    int a = 10;
    Batch2(){
        test t = new test(this);
    }

    void solve(int x, int y){
        System.out.println(x+y);
    }

    public static void main(String[] a) {

        Batch2 b = new Batch2();



        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String n = sc.nextLine();
        // System.out.print("Enter Roll no: ");
        // int num = sc.nextInt();
        // Temp_1 i = new Temp_1(60,"Ritesh");
        // i.disp();


        // //With constructor copy
        // Temp_1 j = new Temp_1(i);
        // j.disp();


        // //Without constructor copy
        // Temp_1 k = new Temp_1();
        // k.roll = i.roll;
        // k.id = i.id;
        // k.disp();

        // int i = 010;
        // int j = 07;
        // System.out.println(i);
        // System.out.println(j);
    }
}

class Temp_1{
    int roll;
    String id;
    Temp_1(){

    }
    Temp_1(int roll, String id){
        this.roll = roll;
        this.id = id;
    }
    public Temp_1(Temp_1 i) {
        roll = i.roll;
        id = i.id;
    }
    void disp(){
        System.out.println("Name is "+id+" Roll no is "+ roll);
    }
}

class Temp{
    String name;
    int roll;

    Temp(String n, int r) {
        roll = r;
        name = n;
        System.out.println();
        System.out.println("Roll no is: " + r);
        System.out.print("Name is: " + n);
    }
}

