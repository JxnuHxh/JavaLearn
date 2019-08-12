package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class send {

	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象（创建连接）
		        
				Socket s = new Socket(InetAddress.getByName("DESKTOP-3OHP9M5"),10086);
				//获取输出流对象
				//System.out.println(InetAddress.getByName("DESKTOP-3OHP9M5"));
				OutputStream os = s.getOutputStream();
				//发送数据
				String str = "hello tcp,im comming!!!";
				os.write(str.getBytes());
				
				InputStream i=s.getInputStream();
				byte[] bys = new byte[1024];
				int len;//用于存储读到的字节个数
				len = i.read(bys);
				System.out.println(new String(bys,0,len));
				//释放资源
				//os.close();
				s.close();
	}
}
