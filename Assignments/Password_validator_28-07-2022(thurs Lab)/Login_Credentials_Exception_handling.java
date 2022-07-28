package Login_Inputs;

import java.util.Scanner;

class PassValidator extends Exception {//Creating class with user defined Exception
    int passLength = 0;
    PassValidator(int num){//creating constructor
        passLength=num;
    }
    public String printMessage()//data function
    {
        switch (passLength) {//switch casees for multiple validation check
            case 1:
                return ("Password length should be between 8 to 15 characters");
            case 2:
                return ("Password should not contain any space");
            case 3:
                return ("Password should contain at least one digit(0-9)");
            case 4:
                return ("Password should contain at least one special character");
            case 5:
                return ("Password should contain at least one uppercase letter(A-Z)");
            case 6:
                return ("Password should contain at least one lowercase letter(a-z)");
        }
        return ("");
    }
}

class Passchecker {//creating class
    public void passchecking(String s) throws PassValidator{//throwimg our own Passvalidator Exception
        boolean flag = true;
        if(s.length()<=8 || s.length()>=15)throw new PassValidator(1);//checking if length is between 8 and 15
        if(s.contains(" "))throw new PassValidator(2);//checking if string contains a spacing " "
        if (flag) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);//checking if string contains even 1 numerics in it
                if (s.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PassValidator(3);//throwing exception if no numericals are found
            }
        }
        if(flag){
            int count = 0;
            final char[] escapeChars = { '<', '(', '[', '{', '\\', '^', '-', '=', '$', '!', '|', ']', '}', ')', '?', '*', '+', '.', '>' };//creating all Special charaters array
            for(int i =0;i<s.length();i++){//looping through string
                for(int j =0;j<escapeChars.length;j++){//looping through special char array
                    if(s.charAt(i)==escapeChars[i]){//checking if string i'th position contains any array elements
                        count++;
                    }
                }
            }
            if(count>0){
                throw new PassValidator(4);//throwing exception if any special characters are found
            }
        }
        if(flag){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(Character.isUpperCase(s.charAt(i))){//checking if string contains Capital letter
                    count=1;
                }
            }
            if(count==0)throw new PassValidator(5);//if no capital letter throwing exception
        }

        if(flag){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(Character.isLowerCase(s.charAt(i))){//checking if string contains Small letter
                    count=1;
                }
            }
            if(count==0)throw new PassValidator(6);//if no small letter throwing exception
        }
    }
}

public class Login_Credentials_Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creating scanner class object
        Passchecker p = new Passchecker();//object creation
        System.out.print("Enter Password: ");
        String str = sc.nextLine();//user input
       // or String str = new Scanner().nextLine();
        try {//try block
            System.out.println("Is Password "+ str + " valid?");
            p.passchecking(str);//calling Passchecker class data function
            System.out.println("Valid Password");
        }
        catch (PassValidator e) {//catch block
            System.out.print(e.getMessage());//displaying error message
            System.out.println(e.printMessage());
        }
    }
}
