package Strings;

public class String_nameAbbrev {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Are you Male or Female? ");
        String honor = sc.next().toUpperCase().equals("MALE")?"Mr":"Mrs";
        String name = "";
        System.out.print("Enter First Name : ");
        name+=sc.next();
        String f = name.substring(0,1).toUpperCase();
        System.out.print("Enter Middle Name : ");
        String middle = sc.next();
        String m = middle.substring(0,1).toUpperCase();
        name+=" "+middle;
        System.out.print("Enter Last Name : ");
        String last = sc.next();
        name+=" "+last;

        System.out.println("Hello sir "+name+" your Abbrev. name is "+"("+honor+" "+f+"."+m+"."+last+")");
    }
}
