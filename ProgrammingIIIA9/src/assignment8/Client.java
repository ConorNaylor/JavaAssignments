package assignment8;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client 
{
	public static void main(String args[]) throws UnknownHostException, IOException, ClassNotFoundException
	{
		//Sending DatagramPacket
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		System.out.print("Please enter your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println();

		oos.writeObject(name);

		byte[] data = bos.toByteArray();
		DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 111);

		DatagramSocket sock = new DatagramSocket();
		sock.send(dp);
		
		//Receiving DatagramPacket
		byte[] buffer = new byte[1000];
		ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
		DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
		DatagramSocket sock2 = new DatagramSocket(112);
		sock2.receive(reply);
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		String ack = (String)ois.readObject();
		System.out.println("The server has responded to " + ack);
	}
}
