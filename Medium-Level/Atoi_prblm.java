public class Atoi_prblm
{
    public static int atoi(String str)
    {
        String result = "0";
        if (str.matches("[+-][0-9]+")){
            result = str;
        }else{
            char[] ch = str.toCharArray();
            for(int i= 0; i< ch.length;i++){
                boolean flag = Character.isDigit(ch[i]);
                if(flag){
                    result = result +ch[i];
                }
            }
        }
        return Integer.parseInt(result);

    }
    public static boolean doTestsPass()
    {
        boolean result=true;
        result=result && atoi("0")==0;
        result=result && atoi("1")==1;
        result=result && atoi("123")==123;
        result=result && atoi("-1")==-1;
        result=result && atoi("-123")==-123;
        result=result && atoi("123a")==123;
        result=result && atoi("a")==0;
        String intMax=String.valueOf(Integer.MAX_VALUE);
        result=result && atoi(intMax)==Integer.MAX_VALUE;
        String intMin=String.valueOf(Integer.MIN_VALUE);
        result=result && atoi(intMin)==Integer.MIN_VALUE;
        return result;
    }
    public static void main(String args[])
    {
        if(doTestsPass())
        {
            System.out.println("All test cases passed");
        }
        else
            System.out.println("There is a test failure");
    }
}