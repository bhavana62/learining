import java.util.Arrays;


public class small {
    public static int findmin(int[] a) {
        int min = a[0];
     
      for(int i=0; i<a.length; i++ ) {
         if(a[i]<min) {
            min = a[i];
         }
      }
      return min;
    }

    public static boolean doTestPass() {

        boolean result = true;
        result = result && (findmin(new int[]{3, 4, 5, 6, 1, 2}) == 1);
        result = result && (findmin(new int[]{2, 1}) == 1);
        result = result && (findmin(new int[]{1}) == 1);
        result = result && (findmin(new int[]{1, 2, 3, 4, 5, 6}) == 1);
        result = result && (findmin(new int[]{4, 1, 2, 3}) == 1);
        result = result && (findmin(new int[]{3, 2, 1, 4}) == 1);
        try {
            findmin(null);
            result = false;
        } catch (Exception e) {
            result = result && true;
        }
        if (result) {
            System.out.println("All test pass");
        } else {
            System.out.println("Test Failed");
        }
        return result;
    }

    public static void main(String[] args) {
        doTestPass();
    }

}
