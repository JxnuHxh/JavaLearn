package dataliu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Dataliu {
  public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("Dataliu.java"));
	String line;
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	while((line=br.readLine())!=null)
	{
		bw.write(line);
		bw.newLine();
	}
	bw.close();
	br.close();
}
}
