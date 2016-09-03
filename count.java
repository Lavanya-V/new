package number;
import java.util.Scanner;
public class count {
	public static void main(String args[]){
		int count=0,b;
		Scanner sd=new Scanner(System.in);
		int a=sd.nextInt();
		while(a>0)
		{
			b=a%10;
			count=count+1;
			a=a/10;
		}
			System.out.println("the number is"+count);
		
	}

}
