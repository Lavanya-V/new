package number;
import java.util.Scanner;
public class Positive {
	public static void main(String args[]){
		
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		if(n>0){
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
	}

}
