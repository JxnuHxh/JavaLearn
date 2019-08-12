package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class buffer {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array=new ArrayList<String>(); 
		array.add("hello");
		array.add("world");
		array.add("java");
		BufferedWriter bw=new BufferedWriter(new FileWriter("array.txt"));
		BufferedReader br=new BufferedReader(new FileReader("array.txt"));
		for(int x=0;x<array.size();x++)
		{
			String s=array.get(x);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		String line;
		while((line=br.readLine())!=null)
		{
			array.add(line);
		}
		for(int x=0;x<array.size();x++)
		{
			String s=array.get(x);
			System.out.println(s);
		}
		bw.close();
	}
}
