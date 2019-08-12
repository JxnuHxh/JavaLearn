package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class receive {
    public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(9999);
		
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
	
		System.out.println("1");
		ds.receive(dp);
		InetAddress address=dp.getAddress();
		
		byte[] data=dp.getData();
		int length =dp.getLength();
		System.out.println("send--->"+address.getHostAddress());
		
		System.out.println(new String(bys,0,length));
		ds.close();
    }
}
