package Threading;

import java.io.IOException;
import java.util.Scanner;

class Infiniteloop extends Thread{
        public void run()
        {
            while(true)
            {   System.out.println("This is infinite Thread");

                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException ie)
                {
                    System.out.println(ie.toString());
                }
            }
        }
    }

public class Threading_Example_InfiniteThread {
    public static void main(String[] args) throws IOException {
        Infiniteloop l1= new Infiniteloop();
        Infiniteloop l2= new Infiniteloop();
        l1.start();
        l2.start();
    }
}
