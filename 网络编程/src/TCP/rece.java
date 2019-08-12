package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class rece {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
 		//监听（阻塞）
		Socket s = ss.accept();
 		//获取输入流对象
		InputStream is = s.getInputStream();
 		//获取数据
		byte[] bys = new byte[1024];
		int len;//用于存储读到的字节个数
		len = is.read(bys);
 		//输出数据
		InetAddress address = s.getInetAddress();
		System.out.println("client ---> " + address.getHostName());
		String str=new String(bys,0,len);
		System.out.println(str);
		String upstr=str.toUpperCase();
 		//释放资源
		OutputStream oi = s.getOutputStream();
		oi.write(upstr.getBytes());
		s.close();
		
	}
}
