package Threading;

class Printer1 implements Runnable{
    String name;
    Printer1(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello "+name+" ur program count is "+i);
        }
    }
}

class canonPrinter1 implements Runnable{
    String name;
    canonPrinter1(String name){
        this.name=name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello "+name+" ur program count is "+i);
        }
    }
}

public class Thread_basics_InterfaceRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Printer1("Ritesh"));
        Thread t1 = new Thread(new canonPrinter1("Raj"));
        t.start();
        t1.start();
    }
}
