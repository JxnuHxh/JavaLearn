package day1;

import java.io.FileWriter;
import java.io.IOException;

public class day01 {
public static void main(String[] args) throws IOException {
	//FileWriter fw=new FileWriter("a.txt");
	FileWriter fw=new FileWriter("a.txt",true);//追加写入
	fw.write("abcdef",2,4);
	char[] chs= {'a','b','s'};
	fw.write(chs);
	for(int x=0;x<10;x++)
	{
		fw.write("hello"+x);
		fw.write("\r\n");
	}
	//数据没有直接写到文件  而是写道缓冲区
	fw.flush();//刷新一下就写进去了
	fw.close();//不释放 程序没结束文件将一直在使用 删除等做不了  
}
}
