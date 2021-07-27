public class Median_of_two_arrays
{
  public static double findMedianSortedArrays(int[] a,int[] b)
  {
     int i=0,j=0,k=0;
     double sum=0;
     int p[]=new int[a.length+b.length];
     while(i<a.length && j<b.length)
     {
         if(a[i]<=b[j])
         {
             p[k]=a[i];
             i++;
             k++;
         }
         else
         {
             p[k]=b[j];
             j++;
             k++;
         }
     }
     while(i<a.length)
     {
         p[k]=a[i];
             i++;
             k++;
     }
     while(j<b.length)
     {
         p[k]=b[j];
             j++;
             k++;
     }
     if(p.length%2==0)
     {
         sum=(double)p[p.length/2]+(double)p[(p.length/2)-1];
         sum=sum/2;
     }
     else
     {
         sum=(double)p[p.length/2];
     }
     return(sum);
     
  }
  
  public static boolean doTestsPass()
  {
    boolean result=true;
    result = result && findMedianSortedArrays(new int[]{1,3} ,new int[]{2,4}) == 2.5;
    result = result && findMedianSortedArrays(new int[]{1,3} ,new int[]{2}) == 2.0;
    return result;
  };
  
  public static void main(String[] args)
  {
    if(doTestsPass())
    {
      System.out.println("All tests passed");
    }
    
    else
    {
      System.out.println("there are test failures");
    }
  }
}