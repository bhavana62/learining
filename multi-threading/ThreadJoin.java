class MyThread extends Thread {
    public void run()
    {	//childthread

	for (int i = 0; i < 5; i++) 
	{  System.out.println("child thread");
	}
    }
}
// Main Class
public class ThreadJoin {
    public static void main(String[] args)throws InterruptedException
  
	{
        MyThread t= new MyThread();
	t.start();
	t.join();
	for (int i = 0; i < 5; i++) {
	System.out.println("main thread");
        }
    }
}

