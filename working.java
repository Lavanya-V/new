package hunter;
import java.util.Scanner;
public class working {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		switch(a)
		{
		case "monday":
			System.out.println("true");
			break;
		case "tuesday":
			System.out.println("true");
			break;
		case "wednesdy":
			System.out.println("true");
			break;
		case "thursday":
			System.out.println("true");
			break;
		case "friday":
			System.out.println("true");
			break;
		case "saturday":
			System.out.println("true");
			break;
		case "sunday":
			System.out.println("false");
			break;
		default:
			System.out.println("enter valid days");
			break;
		}
			
	}

}
