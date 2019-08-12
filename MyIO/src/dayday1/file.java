package dayday1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class file {
public static void main(String[] args) throws IOException {
	//extracted1();
	//extracted2();
	//File f=new File("src\\day1");
	//method(f);
	File f=new File("C:\\Users\\黄小华\\Desktop\\JAVA\\qqqq");
	method1(f);
}
public static void method1(File file) {
	if(file.isDirectory())
	{
		File[] files=file.listFiles();
		for (File f : files) {
			if(f.isFile())
			{
				System.out.println(f.getName());
				f.delete();
			}
			else if(f.isDirectory())
			{
				method1(f);
			}
			
		}
		file.delete();
	}
}


public static void method(File file)
{
	File[] files=file.listFiles();
	for(File f: files)
	{
		if(f.isFile())
		{
			if(f.getName().endsWith(".java"))//输出文件下的Java目录
				System.out.println(f.getName());
		}
	}
}

private static void extracted2() {
	File f3=new File("a");
	File f2=new File("b.txt");
	String[] files=f3.list();
	//File[] listFiles();
	
	for(int i=0;i<files.length;i++)
	{
		System.out.println(files[i]);//输出文件夹下目录
	}
}

private static void extracted1() throws IOException {
	File f=new File("a.txt");//对象指向文本文件
	File f1=new File("b.txt");
	
	System.out.println("创建文件"+f.createNewFile());
	
	System.out.println("是否是绝对路径："+f.isAbsolute());
	
	System.out.println("判断对象是否指向文件夹："+f.isDirectory());
	
	System.out.println("判断对象是否指向文件："+f.isFile());
	
	System.out.println("文件的最后修改时间:"+f.lastModified());
	
	System.out.println("返回文件名:"+f.getName());
	
	System.out.println("是否隐藏"+f.isHidden());
		
	System.out.println("判断文件是否存在"+f.exists());	
	
	System.out.println("返回对象文件:"+f.getAbsoluteFile());
	
	System.out.println("返回绝对路径是字符串:"+f.getAbsoluteFile());
	
	System.out.println("返回父文件:"+f.getParent());
	
	System.out.println("返回文件的字节数:"+f.length());
	
	System.out.println("修改文件名:"+f.renameTo(f1));
	
	System.out.println("删除文件:"+f.delete());
}
	
}
