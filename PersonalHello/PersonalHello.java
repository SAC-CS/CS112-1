import java.util.Scanner;
public class PersonalHello 
{	
  public static void main(String[] args) 
    {
 	String UserName;

        System.out.println("My name is Java. What is your name? ");
		
        Scanner in = new Scanner(System.in);
	UserName = in.next();

        System.out.println("Hello " + UserName + "! Have a good day!");

    }

}
