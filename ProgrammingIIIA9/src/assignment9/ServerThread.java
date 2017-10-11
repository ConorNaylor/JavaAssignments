package assignment9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ServerThread extends Thread
{
	private FileOutputStream fos;
	private ObjectInputStream ois;
	private File file;
	private myFile myfile;
	private String destination = "C:/Users/Conor/Desktop/Assignment9In/";
	private int fileSize = 100000;
	byte[] data = new byte[fileSize];
	private String fileName;

	//For sending files
	private ObjectOutputStream oos;
	private String sendSource = "C:/Users/Conor/Desktop/Assignment9In/Conor.txt";
	private Path p;
	private FileInputStream fis;
	private myFile myfileUp;
	private Socket connection;

	ServerThread(Socket socket)
	{
		this.connection = socket;
	}


	public void run()
	{
		try {
			getInstructions();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Connection Lost");
		}finally{
			try {
				closeSock();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void receiveFile() throws IOException, ClassNotFoundException 
	{
		while(true)
		{
			myfile = (myFile)ois.readObject();
			if(myfile != null)
			{
				break;
			}
		}
		
		data = myfile.getData();
		fileName = myfile.getName();

		//file = new File(destination);
		file = new File(destination + fileName);

		fos = new FileOutputStream(file);
		fos.write(data);

		if(fos != null)
		{
			fos.flush();
			fos.close();
		}
		System.out.println("The file " + fileName + " has been recieved from the client and has been placed in the location:" + file.getAbsolutePath());
	}

	public void sendFile() throws IOException, ClassNotFoundException 
	{	
		p = Paths.get(sendSource);
		String fileName = p.getFileName().toString();

		System.out.println("Server: The file " + fileName + " is being sent to the client.");

		//creating file and FileInputStream so that the file data can be passed to myFile object
		File fileUp = new File(sendSource);
		fis = new FileInputStream(sendSource);

		byte[] b = new byte[(int) fileUp.length()];

		//Hold data related to chosen file
		try
		{
			fis.read(b);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("Error reading input file on the server.");
		}

		//passing the details of the chosen file into myFile object 
		myfileUp = new myFile();
		myfileUp.setName(fileName);
		myfileUp.setsourcePath(sendSource);
		myfileUp.setSize(b.length);
		myfileUp.setData(b);

		try{
			oos.writeObject(myfileUp);
			System.out.println("Got to here");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Error sending file");
		}
	}

	private void closeSock() throws IOException 
	{
		connection.close();	
	}

	private void getInstructions() throws ClassNotFoundException, IOException
	{
		ois = new ObjectInputStream(connection.getInputStream());
		oos = new ObjectOutputStream(connection.getOutputStream());
		
		while(true)
		{
			String check = "" + ois.readObject();
			
			if(check.endsWith("p"))
			{
				System.out.println("Awaiting file from client");
				receiveFile();
			}
			if(check.endsWith("n"))
			{
				sendFile();
			}
		}
	}
}