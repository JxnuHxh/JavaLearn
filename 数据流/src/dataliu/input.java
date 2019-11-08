package dataliu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class input {
   public static void main(String[] args) throws IOException {
	InputStream is =System.in;
	Reader r=new InputStreamReader(is);//×ª»»Á÷
	FileWriter fw =new FileWriter("a.txt");
	char[] bys=new char[1024];
	int len;
	while((len=r.read(bys))!=-1)
	{
		fw.write(bys,0,len);
		fw.flush();
	}
	fw.close();
	is.close();
	
}
}
