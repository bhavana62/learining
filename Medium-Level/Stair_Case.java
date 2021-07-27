import java.util.Scanner;

public class Stair_Case {
	public static void main(String[] args) {
		int i=0;
	     @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number");
	     int n=sc.nextInt();
	      int[] p = new int[n+2];
	      p[0]=1;
	      p[1]=1;
	      p[2]=2;
	      for(i=3;i<=n;i++) {
	    	  p[i]=p[i-1]+p[i-2]+p[i-3];
	      }
	       System.out.println(p[n]);

	}
}
