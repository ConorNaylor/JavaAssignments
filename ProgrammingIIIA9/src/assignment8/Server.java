package assignment8;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server 
{
	public static void main( String args[]) throws IOException, ClassNotFoundException
	{
		//Receiving DatagramPacket
		byte[] data = new byte[1000];
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		
		DatagramPacket dp = new DatagramPacket(data, data.length);
		DatagramSocket sock = new DatagramSocket(111);
		sock.receive(dp);
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		String name = (String)ois.readObject();
		System.out.println("Received message from: " + name );
		ois.close();
		
		// Returning DatagramPacket
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(name);
		byte[] replyData = bos.toByteArray();
		DatagramPacket reply = new DatagramPacket(replyData, replyData.length,InetAddress.getByName("localhost"),112);
		DatagramSocket sock2 = new DatagramSocket();
		sock2.send(reply);
	}
}
