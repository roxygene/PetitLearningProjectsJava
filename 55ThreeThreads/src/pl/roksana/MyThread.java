package pl.roksana;

public class MyThread implements Runnable
{
    int counter;
    Thread thread;

    MyThread(String name)
    {
        thread = new Thread(this,name);
        counter = 0;
        thread.start();
    }

    public void run()
    {
        System.out.println(thread.getName() + " starts.");
        try
        {
            do {
                Thread.sleep(500);
                System.out.println(thread.getName() + ", counter = " + counter) ;
                counter++;
            }
            while (counter < 10);
        }
        catch (InterruptedException e)
        {
            System.out.println(thread.getName() + " stopped.");
        }
        System.out.println(thread.getName() + " finished.");
    }
}
