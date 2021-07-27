public class ATIO_logic{
@SuppressWarnings("null")
public static int atoi(String str) {
	if(str==null && str.length()<=0) {
		return 0;
	}
	str=str.trim();
	char flag='+';
	int i=0;
	if(str.charAt(0)=='+') {
	i++;
	}
	if(str.charAt(0)=='-') {
		flag='-';
		i--;
	}
	double result=0;
	if(str.length()> i&&str.charAt(i)>'0' && str.charAt(i)<'9') {
		result = result * 10 + (str.charAt(i) - '0');
		i++;
	}
	if (flag == '-')
		result = -result;
 
	
	if (result > Integer.MAX_VALUE)
		return Integer.MAX_VALUE;
 
	if (result < Integer.MIN_VALUE)
		return Integer.MIN_VALUE;
 
	return (int) result;
}
//Implementing the test cases
public static boolean doTestsPass()
{
boolean result=true;
result=result && atoi("0")==0;
System.out.println(result);
result=result && atoi("1")==1;
System.out.println(result);
result=result && atoi("123")==123;
System.out.println(result);
result=result && atoi("-1")==-1;
System.out.println(result);
result=result && atoi("-123")==-123;
System.out.println(result);
result=result && atoi("123a")==123;
System.out.println(result);
result=result && atoi("a")==0;
System.out.println(result);
String intMax=String.valueOf(Integer.MAX_VALUE);
result=result && atoi(intMax)==Integer.MAX_VALUE;
System.out.println(result);
String intMin=String.valueOf(Integer.MIN_VALUE);
result=result && atoi(intMin)==Integer.MIN_VALUE;
System.out.println(result);
return result;
}
public static void main(String args[])
{
if(doTestsPass())
{
System.out.println("all test cases passed");
}
else
System.out.println("there is a teat failure");
}
  }