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

///

import java.util.*;public class Average {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		String[][] input=new String[][]{{"Alpha" ,"99"},{"Bravo" , "99"},{"Delta","99"},{"Echo","99"},{"Fortrot","99"},{"Fortrot","99"}};
		HashMap<String,ArrayList<Integer>>a=new HashMap<String,ArrayList<Integer>>();
		for(int i=0;i<input.length;i++){
			if(a.containsKey(input[i][0])){
				a.get(input[i][0]).add(Integer.parseInt(input[i][1]));
				}else{
					ArrayList<Integer>temp=new ArrayList<Integer>();
					temp.add(Integer.parseInt(input[i][1]));
                    a.put(input[i][0], temp);
                    }
			}
		double max=0;
		for(String i:a.keySet()){
			double avg=0;
			for(int j:a.get(i)){
			avg+=j;
			}
			avg=avg/a.get(i).size();
			if(avg>max)
				max=avg;
			}
		System.out.println(max);
		
	}
}
