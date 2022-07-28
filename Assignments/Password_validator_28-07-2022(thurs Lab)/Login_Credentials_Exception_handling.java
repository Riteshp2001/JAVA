package Login_Inputs;

import java.util.Scanner;

class PassValidator extends Exception {
    int passLength = 0;
    PassValidator(int num){
        passLength=num;
    }
    public String printMessage()
    {
        switch (passLength) {
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

class Passchecker {
    public void passchecking(String s) throws PassValidator{
        boolean flag = true;
        if(s.length()<=8 || s.length()>=15)throw new PassValidator(1);
        if(s.contains(" "))throw new PassValidator(2);
        if (flag) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);
                if (s.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PassValidator(3);
            }
        }
        if(flag){
            int count = 0;
            final char[] escapeChars = { '<', '(', '[', '{', '\\', '^', '-', '=', '$', '!', '|', ']', '}', ')', '?', '*', '+', '.', '>' };
            for(int i =0;i<s.length();i++){
                for(int j =0;j<escapeChars.length;j++){
                    if(s.charAt(i)==escapeChars[i]){
                        count++;
                    }
                }
            }
            if(count>0){
                throw new PassValidator(4);
            }
        }
        if(flag){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(Character.isUpperCase(s.charAt(i))){
                    count=1;
                }
            }
            if(count==0)throw new PassValidator(5);
        }

        if(flag){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(Character.isLowerCase(s.charAt(i))){
                    count=1;
                }
            }
            if(count==0)throw new PassValidator(6);
        }
    }
}

public class Login_Credentials_Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Passchecker p = new Passchecker();
        System.out.print("Enter Password: ");
        String str = sc.nextLine();
        try {
            System.out.println("Is Password "+ str + " valid?");
            p.passchecking(str);
            System.out.println("Valid Password");
        }
        catch (PassValidator e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}