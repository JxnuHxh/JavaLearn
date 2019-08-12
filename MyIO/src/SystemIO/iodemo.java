package SystemIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class iodemo {
public static void main(String[] args) throws IOException {
	//extracted1();
	
}

private static void extracted1() throws FileNotFoundException, IOException {
	BufferedReader br = new BufferedReader(new FileReader("copy.java"));
	Writer w=new OutputStreamWriter(System.out);
	String line;
	while((line=br.readLine())!=null)
	{
		w.write(line+"\r\n");
		
	}
	w.close();
	br.close();
}
}
