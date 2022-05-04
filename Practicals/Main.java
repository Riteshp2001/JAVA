public class Main{
  public static void main(String[] args) {
    System.out.println("Hello World");
    char x1,x2;
    byte x3,x4;
    short x5;
    int x6,x7,added;
    long x9, x10,Lmul;
    x1 ='8';
    x2 ='A';
    x3 = 127;
    x4 = -32;
    x5 = 6000;
    x6 = -7000;
    x7 = 12000;
    x9 = 10000L;
    x10 = 321L;
    Lmul = x9 * x10;
    added = x6 + x7;
    System.out.println("First Number: "+x1);
    System.out.println("Second Letter: "+x2);
    System.out.println("Byte1: "+x3);
    System.out.println("Byte2: "+x4);
    x3++;
    System.out.println(("incremented value? :"+x3));
    System.out.println("short value: "+x5);
    System.out.println("First integer Number: "+x6);
    System.out.println("Second integer Number: "+x7);
    System.out.println("added integer number: "+ added);
    System.out.println("First long Number: "+x9);
    System.out.println("Second long Number: "+x10);
    System.out.println("mul long number: "+ Lmul);
  }
}
