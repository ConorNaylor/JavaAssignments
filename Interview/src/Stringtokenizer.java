import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer 
{
	public static void main(String[] args)
	{
		System.out.println("Enter date in format YEAR:MM:DY");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, ":");
		for(int i = 0; i < (st.countTokens()+2); i++){
		String j = st.nextToken();
		System.out.println(Integer.parseInt(j));
		}
	}

}
