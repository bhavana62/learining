class Hi implements Runnable {
    public void run()
    {	
	for (int i = 0; i < 5; i++) 
	{  System.out.println("Hi");

        try {
           
             Thread.sleep(500);
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
}
class Hello implements Runnable {
    public void run()
    {	
	for (int i = 0; i < 5; i++) 
	{  System.out.println("Hello");}
    }
}
// Main Class
public class Multithread {
    public static void main(String[] args)
    {//mainthread
        Runnable object= new Hi();
 	Runnable object1= new Hello();
	Thread t1= new Thread(object);
 	Thread t2= new Thread(object1);

		t1.start();
 		try {
           
             Thread.sleep(500);
       		 }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
                t2.start();
        }
    }