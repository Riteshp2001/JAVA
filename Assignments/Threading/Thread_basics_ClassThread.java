package Threading;

class Printer extends Thread{
    String name;
    Printer(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello "+name+" ur program count is "+i);
        }
    }
}

class canonPrinter extends Thread{
    String name;
    canonPrinter(String name){
        this.name=name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello "+name+" ur program count is "+i);
        }
    }
}

public class Thread_basics_ClassThread {
    public static void main(String[] args) {
        Printer p = new Printer("Ritesh");
        canonPrinter c = new canonPrinter("Raj");
        p.start();
        c.start();
    }
}
