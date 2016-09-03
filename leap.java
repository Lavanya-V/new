package number;
import java.util.Scanner;
public class leap {
	public static void main(String args[]){
		Scanner sa=new Scanner(System.in);
		int x=sa.nextInt();
		if(x%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("non-leap year");
		}
	}

}
