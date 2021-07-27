import java.util.ArrayList;
import java.util.Arrays;

public class DistanceBetweenString {
    public static double shortestDistance(String a,String b,String c){
        //@SuppressWarnings("unchecked")
		ArrayList<String> list = new ArrayList<String>();int count;int first, last;

        String[] strArray = a.split(" ");
        list.addAll(Arrays.asList(strArray));
        int index1 = list.indexOf(b);
        int index2 = list.indexOf(c);

        if(index1 == -1 || index2 == -1){
            return -1;
        }
// count is for to count spaces
        count = index2 - index1;
        for(int i=index1+1; i<index2;i++ ) {
             char[] ch = strArray[i].toCharArray();
            count = count + ch.length;
        }
        char[] arr1 = strArray[index1].toCharArray();
        char[] arr2 = strArray[index2].toCharArray();
        first = arr1.length - (arr1.length/2);
        last = arr2.length/2;

        if(arr2.length == 1){
            last = 1;
        }

        count = count + first + last;
        System.out.println(count);
        return count;
        }
        public static boolean doTestPass() {
        String document = "This is a sample document we just made up";
        boolean value = true;
    value = value && shortestDistance(document,"we","just")==4;
    value = value && shortestDistance(document,"is","a")==3;
    value = value && shortestDistance(document,"is","not")==-1;

    if(value){
        System.out.println("ALl Test Cases Passed");
    }else{
        System.out.println("Test Case Failed");
    }return value;
}
        public static void main(String[] Args) {
            doTestPass();
        }
        }