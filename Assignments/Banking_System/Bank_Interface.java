package Banking_System;

import java.util.Locale;
import java.util.Scanner;

interface Bank_Interface {
    void open_account();
    void show_Accdetails();
    void withdraw();
    void deposit();
}

class MainBank implements Bank_Interface{
    Scanner sc = new Scanner(System.in);
    private int bal = 500;
    private int dep , bank_id;
    private String name;

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    @Override
    public void open_account() {
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        this.setName(name);
        System.out.print("Enter Your Bank Id : ");
        int bank_id  = sc.nextInt();
        this.setBank_id(bank_id);
    }

    @Override
    public void show_Accdetails() {
        System.out.println(bank_id + "," + name + "," + bal);
    }

    @Override
    public void withdraw() {

        long amount;
        System.out.print("Enter Amount to Withdraw : ");
        amount = sc.nextLong();
        try {
            if (bal >= amount) {
                bal = (int) (bal - amount);
            } else {
                System.out.println("Bank Balance is too Low to Complete Transaction ! Please add money to account");
            }
        }catch (Exception e){
            System.out.println(" Error 404 :/   !!!Enter Correct numerical Value ");
            withdraw();
        }
    }

    @Override
    public void deposit() {
        long amount;
        System.out.print("Enter Amount U Want to Deposit : ");
        try {
            amount = sc.nextLong();
            bal += amount;
        }catch (Exception e){
            System.out.println(" Error 404 :/   !!!Enter Correct numerical Value ");
            deposit();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input Account details to check Account status ...");
        MainBank m = new MainBank();
        m.open_account();
        String option;
        do {
            System.out.println("\n\nChoose Options to Manipulate your Transactions \n 1 -> Deposit \n 2 -> Withdraw \n 3 -> Details \n X -> Quit \n");
            option = sc.nextLine();
            option = option.toLowerCase();
            if(option.equals("1")){
                m.deposit();
            } else if (option.equals("2")) {
                m.withdraw();
            } else if (option.equals("3")) {
                m.show_Accdetails();
            } else if (option.equals("x")) {
                System.out.println("\nThank you! for Joining Our Bank See you soon ...");
            }else {
                System.out.println("Sry... choose correct options\n Please choose other option");
            }
        } while(!option.equals("x"));
    }
}
