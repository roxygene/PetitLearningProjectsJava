//Program creates three threads
package pl.roksana;

public class Main {

    public static void main(String[] args) {
        System.out.println("My thread starts.");

        MyThread mt1 = new MyThread("Thread 1");
        MyThread mt2 = new MyThread("Thread 2");
        MyThread mt3 = new MyThread("Thread 3");

        do {
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Main thread got stopped.");
            }
        }
        while(mt1.counter < 10 || mt2.counter < 10 || mt3.counter < 10);
        System.out.println("Main thread got finished!");


    }
}
