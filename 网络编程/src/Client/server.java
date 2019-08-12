package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) throws IOException {
		
	
	//创建服务器端Socket对象
			ServerSocket ss = new ServerSocket(1010);
			//监听
			Socket s = ss.accept();
			//获取输入流对象
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//获取用户名和密码
			String username = br.readLine();
			String password = br.readLine();
			//判断用户名和密码是否正确
			boolean flag = false;
			if("itheima".equals(username) && "123456".equals(password)) {
				flag = true; //flag  默认false
			}
			//获取输出流对象
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			
			//返回判断信息
			if(flag) {
				out.println("登陆成功");//标准输出流
			}
			else {
				out.println("登陆失败");
			}
			//释放资源
			s.close();
			//ss.close();//服务器一般不关闭
	}
}
