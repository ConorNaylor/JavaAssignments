
	

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

import sun.print.resources.serviceui;

/**
 * Trivial client for the date server.
 */
public class DateClient {

    /**
     * Runs the client as an application.  First it displays a dialog
     * box asking for the IP address or hostname of a host running
     * the date server, then connects to it and displays the date that
     * it serves.
     */
    public static void main(String[] args) throws IOException {
      
      
    	Socket s = new Socket("localhost", 9090);
    	
    	 PrintWriter pw = new PrintWriter(s.getOutputStream());
    	 pw.write("String from client");
    	 
//    	BufferedReader input =
//            new BufferedReader(new InputStreamReader(s.getInputStream()));
//        String answer = input.readLine();
//       System.out.println(answer);
    }
}