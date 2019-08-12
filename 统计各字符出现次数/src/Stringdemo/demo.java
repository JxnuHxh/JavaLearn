package Stringdemo;

public class demo {
public static void main(String[] args) {
	String s="dsjakaA";
	char[] chs=s.toCharArray();
	for(int x=0;x<chs.length;x++)
	{
		System.out.println(chs[x]);
	}
	System.out.println("------");
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	 
	String s1=s.substring(0, 1);
	String s2=s.substring(1);
	String s3=s1.toUpperCase()+s2.toLowerCase();
	System.out.println(s3);
}

}
