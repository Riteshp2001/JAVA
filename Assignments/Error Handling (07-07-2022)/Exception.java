package Testing;

public class Exception {

    //Exception are of two types
    //1)checked and compile time

    //int n1 = 10//this is checked error during compile time
    //int n2 = 20;
    /*public static void main(String[] args) {
        //2)Unchecked and Run time
        int n1 = 10;
        int n2 = 0;//this is unchecked error only get at run time( its arithmetic exception divide by zero)
        System.out.println(n1/n2);
    }*/



    //Exception Handling

    public static void main(String[] args) {
        //1) Try and Catch(keyword)
        //catch is main keyword which actually handles Exception
        try{
            int n1 = 10,n2=0;
            System.out.println(n1/n2);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        //2)finally(Keyword) it always executes even if we have exception or not
        finally{
            System.out.println("This shows even if exception is handled or not");
        }
        //3)throw(keyword) to show the exception
        //4)throws(keyword) to declare the Exception


        //Types of Exception or situation where exception occurs
        //1)Arithmetic Exception: Any number divide by Zero
        //2)NullPointerException: if any value reaches or provided(initializing) is Null
        String a = null;
        System.out.println(a.length());
        //3)ArrayIndexoutofBoundsException: if we are initializing value greater than length of array
        int[] arr = new int[10];
        arr[20]=6;
        //4)NumberFormatException: Converting from one format to another format
        String t = "Ritesh";
        int n = Integer.parseInt(t);//cannot convert from string to number but can convert numerical string to int
    }
}
