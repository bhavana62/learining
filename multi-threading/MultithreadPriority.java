// Main Class
public class Multithread {
    public static void main(String[] args)
    {//mainthread
	{ 
	 System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(7);
        MyThread t= new MyThread();
	System.out.println(t.getPriority());
        }
    }
}class MyThread extends Thread {
    public void run()
    {	//childthread
	for (int i = 0; i < 5; i++) 
	{  System.out.println("Hello");}
    }
}
