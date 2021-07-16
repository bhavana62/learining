class MyThread extends Thread {
    public void run()
    {	//childthread
	for (int i = 0; i < 5; i++) 
	{  System.out.println("child thread");
	Thread.yield();
	}
    }
}
// Main Class
public class Multithread {
    public static void main(String[] args)
  
	{
        MyThread t= new MyThread();
	t.start();
	for (int i = 0; i < 5; i++) {
	System.out.println("main thread");
        }
    }
}

