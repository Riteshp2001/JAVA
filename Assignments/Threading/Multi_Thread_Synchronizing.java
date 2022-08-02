package Threading;

import java.util.Scanner;

class Banking_Sync{
    int bal;
    Banking_Sync(int bal){
        this.bal= bal;
    }

    public boolean isSufficient(int w){
        return bal >= w;
    }

    public void withdraw(int amt){
        bal = bal-amt;
        System.out.println("withdraw money is "+amt);
        System.out.println("Curr balance is "+bal);
    }
}

class Customer implements Runnable{

    private Banking_Sync b;
    private String name;
    public Customer(Banking_Sync b, String name){
        this.b = b;
        this.name = name;
    }

    @Override
    public void run() {
        //Sows error in amount withdrawn as both program running parallely
//        System.out.println(name);
//        System.out.println("Enter Withdraw Amount");
//        int w = new Scanner(System.in).nextInt();
//        if(b.isSufficient(w)){
//            b.withdraw(w);
//        }else{
//            System.out.println("Amount is Insufficient to withdraw");
//        }

        //Using Synchronized
        synchronized (b){
            System.out.println(name);
            System.out.println("Enter Withdraw Amount");
            int w = new Scanner(System.in).nextInt();
            if(b.isSufficient(w)){
                b.withdraw(w);
            }else{
                System.out.println("Amount is Insufficient to withdraw");
            }
        }
    }
}

public class Multi_Thread_Synchronizing {
    public static void main(String[] args) {
    Banking_Sync b = new Banking_Sync(1000);
    Customer c1 = new Customer(b,"Raj");
    Customer c2 = new Customer(b,"Ritesh");
    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(c2);
    t1.start();t2.start();
    }
}
