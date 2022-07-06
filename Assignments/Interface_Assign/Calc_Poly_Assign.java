package Testing;

public class Calc_Poly_Assign {

    //Method Overloading for Multiplication
    static void mul(int a,int b){
        System.out.println(a*b);
    }
    static void mul(int a,int b,int c){//Method overloading for data function mul
        System.out.println(a*b*c);
    }

    //imagine if we want to overload method with countably 100 of arguments then we can usee '...' in atguments
    static int mul(int ...arr){//we can pass now as many arguments as we need
        int res = 0;
        for(int i : arr){
            res*=i;
        }
        return res;
    }

    //Method Overloading for Addition
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){//Method overloading for data function add
        System.out.println(a+b+c);
    }

    static int add(int ...arr){
        int res = 0;
        for(int i : arr){
            res+=i;
        }
        return res;
    }

    //Method Overloading for Subtraction
    static void sub(int a,int b){
        System.out.println(a-b);
    }
    static void sub(int a,int b,int c){//Method overloading for data function sub
        System.out.println(a-b-c);
    }

    static int sub(int ...arr){
        int res = 0;
        for(int i : arr){
            res+=i;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
