package dataliu;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * println()
 * 可以输出除原始字节外的所有类型
 */
public class print {
    public static void main(String[] args) throws IOException {
		extracted1();
    	
	}

	private static void extracted1() throws IOException {
		//PrintWriter pw=new PrintWriter("b.txt");
    	PrintWriter pw=new PrintWriter(new FileWriter("b.txt"),true);//自动刷新
		pw.println("hello");
		pw.println("hello");
		pw.println("hell");
		pw.close();
	}
}
