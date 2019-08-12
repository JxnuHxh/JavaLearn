package 异常;

/*
 * try
 * {
 *    可能出现问题的代码；
 * }catch(参数异常对象)
 * {
 *    处理异常
 * }
 * 
 */
public class exception {
public static void main(String[] args) {
	extracted1();
	try {
		String s=null;
		System.out.println(s.length());
		
	}catch(NullPointerException e)   //NullPointerException是Exception的子类 可以直接填
	{
		System.out.println("出现空指针");
		e.printStackTrace();
	}
	
	System.out.println("hello");
	try {5
		int[] arr=new int[5];
		System.out.println(arr[9]);
		
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("数组越界");
	}
	
}

private static void extracted1() {
	try {
		System.out.println("1");
	System.out.println(2/0); //直接跳到异常处理
	System.out.println("2");
	}catch(ArithmeticException ae)
	{
		System.out.println("除数不能为0");//没有出现异常不执行
	}
}
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at 异常.exception.main(exception.java:5)
