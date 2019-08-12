package StringTest1;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String s=sc.nextLine();
		for(int x=s.length()-1;x>=0;x--)
		{
			System.out.print(s.charAt(x));
		}
		System.out.println();
		 String re=reverse(s);
		 System.out.println(re);
	}
	public static String reverse(String s) {
		char [] chs=s.toCharArray();
		for(int i=0,j=chs.length-1;i<j;i++,j--)
		{
			char temp=chs[i];
			chs[i]=chs[j];
			chs[j]=temp;
		}
		String ss=new String(chs);
		return ss;
	}

}
