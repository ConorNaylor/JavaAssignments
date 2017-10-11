package assignment9;

//Conor Naylor 14316026

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Client extends JFrame 
{
	//Setting up variables to be used in file transfer
	private myFile myfile;
	private Socket connection;
	private FileOutputStream fos;
	private FileInputStream fis;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private String source;
	private Path p;

	//Setting up variables to be used in GUI
	private JFileChooser fc;
	private JButton searchFile, sendReFile ;
	private Container container;
	private JButton modeButton;
	private boolean mode;
	private String modeDown = "Set Mode: Upload"; //If its ready to download then the button will display "Set Mode: Upload." 
	private String modeUp = "Set Mode: Download";
	private String up = "Upload File"; //If in mode modeUp, the button will display "Upload File"
	private String down = "Download File";
	private int counter = 0;

	//Variables to download file from server
	private String destination = "C:/Users/Conor/Desktop/ServerDownload/";
	private File fileDown;
	private myFile myfileDown;
	private int fileSize = 100000;
	private byte[] dataArray = new byte[fileSize];
	private String fileName;

	Client() throws IOException   
	{
		super("File Transfer");
		
		System.out.println("Client Started");

		System.out.println("Please select a file to be uploaded to server.");
		
		connection = new Socket("127.0.0.1", 444);

		//Container and layout to be used
		container = getContentPane();
		container.setLayout(new GridLayout(3, 2));

		searchFile = new JButton("Search for File");
		container.add(searchFile);
		searchFile.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						searchFile();
					}
				}
				);

		sendReFile = new JButton(up);
		container.add(sendReFile);
		sendReFile.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try {
							if(mode)
							{
								sendFile(); 
							}
							else
							{
								recieveFile();
							}
						} catch (IOException | ClassNotFoundException e1) {
							System.out.println("Was not able to send file." );
							e1.printStackTrace();
						}
					}
				}
				);

		mode = true;
		modeButton = new JButton(modeUp);
		container.add(modeButton);
		modeButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						setMode();
					}
				}
				);

	}

	protected void setMode() 
	{
		if(mode)
		{
			modeButton.setText(modeDown);
			sendReFile.setText(down);
			mode = false;
		}
		else 
		{
			modeButton.setText(modeUp);
			sendReFile.setText(up);
			mode = true;
		}
	}

	protected void sendFile() throws IOException, ClassNotFoundException 
	{
		if(counter != 0)
		{
			oos = new ObjectOutputStream(connection.getOutputStream());
			
			setInstructions("up"); 
			
			//finding the name of the file we are sending
			p = Paths.get(source);
			String fileName = p.getFileName().toString();

			System.out.println("Client: The file " + fileName + " is being sent to the server.");

			//creating file and FileInputStream so that the file data can be passed to myFile object
			File file = new File(source);
			fis = new FileInputStream(source);

			byte[] b = new byte[(int) file.length()];

			//Hold data related to chosen file
			try
			{
				fis.read(b);
			}catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println("Error reading input file.");
			}

			//passing the details of the chosen file into myFile object 
			myfile = new myFile();
			myfile.setName(fileName);
			myfile.setsourcePath(source);
			myfile.setSize(b.length);
			myfile.setData(b);

			try{
				oos.writeObject(myfile);
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("Error sending file");
			}
		}
		else
		{
			System.out.println("No file has yet been chosen to send.");
		}
	}

	protected void recieveFile() throws IOException, ClassNotFoundException
	{	
		setInstructions("down");
		
		System.out.println("Downloading file form server!...");
		
		ois = new ObjectInputStream(connection.getInputStream());
		
		while(true)
		{
			myfileDown = (myFile)ois.readObject();
			if(myfileDown != null)
			{
				System.out.println("got here");
				break;
			}
		}
		
		dataArray = myfileDown.getData();
		fileName = myfileDown.getName();

		//fileDown = new File(destination);
		fileDown = new File(destination + myfileDown.getName());
		
		fos = new FileOutputStream(fileDown);
		fos.write(dataArray);

		if(fos != null)
		{
			fos.flush();
			fos.close();
		}
		System.out.println("The file " + fileName + " has been recieved from the server and has been placed in the loacation:" + fileDown.getAbsolutePath());
	}

	private void setInstructions(String string) throws IOException, ClassNotFoundException 
	{
		oos.writeObject(string);

		oos.flush();
	}

	private void searchFile()
	{
		fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION)
		{
			String location = fc.getSelectedFile().getPath();
			File selectedFile = fc.getSelectedFile();
			System.out.println("Selected file: " + selectedFile.getPath());
			source = location;
			counter++;
		}
	}


	public static void main(String[] args) throws UnknownHostException, IOException
	{
		Client client = new Client();
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.setSize(500, 350);
		client.setVisible(true);
		client.setLocationRelativeTo(null);
	}

}
