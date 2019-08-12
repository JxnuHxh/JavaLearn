package 统计各字符出现次数;

import java.util.Scanner;

public class stringcount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个字符串:");
	String s=sc.nextLine();
	int bigCount=0;
    int smallCount=0;
    int numCount = 0;
    
    for(int x=0;x<s.length();x++)
    {
    	char ch=s.charAt(x);
    	if(ch>='A'&&ch<='Z')
    		bigCount++;
    	if(ch>='a'&&ch<='z')
    		smallCount++;
    	if(ch>='0'&&ch<='9')
    		numCount++;
    }
    System.out.println(bigCount);
    System.out.println(smallCount);
    System.out.println(numCount);
}
}
