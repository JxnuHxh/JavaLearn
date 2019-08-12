package day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class readers {
public static void main(String[] args) throws IOException {
/*
 * 复制文本文件的5种方式
 
	BufferedWriter bw=new BufferedWriter(new FileWriter("bw.txt"));
	bw.write("hello");
	
*/
	BufferedReader br=new BufferedReader(new FileReader("copy.java"));
	char[] chs=new char[1024];
	int len;
	while((len=br.read(chs))!=-1)
	{
		System.out.print(new String(chs,0,len));// 一次读写一个数组  效率高
	}
	
	br.close();
}
}
