import java.util.*;
public class Input {
	public static void main(String args[])
{
	String name;
	Scanner in = new Scanner(System.in);
	System.out.println("What is your Name: ");
	name=in.nextLine();
	in.close();
	System.out.println("Hello " + name);
	}
}