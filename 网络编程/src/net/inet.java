package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class inet {
   public static void main(String[] args) throws IOException {
	
	   DatagramSocket ds=new DatagramSocket();
	
	byte[] bys="hello udp ,im comming".getBytes();
	DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("DESKTOP-3OHP9M5"),9999);
    
	ds.send(dp);
	ds.close();
   }
}
