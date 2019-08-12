package StringBuild;

import java.util.Scanner;

public class sb1 {

	public static void main(String[] args) {
		//定义一个数组
		int[] arr= {1,2,2,2,1};
		String s=arrToString(arr);
		System.out.println(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String st=sc.nextLine();
		System.out.println(myreverse(st));
		
	}
	public static String myreverse(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String result=sb.toString();
		return result;
		
	}
	public static String arrToString(int[] arr)
	{
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x==arr.length-1) {
				sb.append(arr[x]);
			}
			else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		String result = sb.toString();
		return result;
	}
}
