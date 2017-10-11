package assignment9;


import java.io.*;
import java.net.*;

public class Server 
{

	public static void main(String[] args) throws IOException
	{
		Server server = new Server();
		server.runServer();
		
	}

	public void runServer() throws IOException
	{
		System.out.println("Server started.");
		ServerSocket ss = new ServerSocket(444);
		while(true)
		{
			Socket s = ss.accept();
			new ServerThread(s).start();
			System.out.println("Connection made.");
		}


	}
}