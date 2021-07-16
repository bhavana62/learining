class Hi extends Thread {
    public void run()
    {	//child thread
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
class Hello extends Thread {
    public void run()
    {	//childthread
	for (int i = 0; i < 5; i++) 
	{  System.out.println("Hello");}
    }
}
// Main Class
public class Multithread {
    public static void main(String[] args)
    {//mainthread
        Hi object= new Hi();
 	Hello object1= new Hello();
		object.start();
                object1.start();
        }
    }