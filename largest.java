package number;
import java.util.Scanner;
public class largest {
	public static void main(String args[]){
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int b=sn.nextInt();
		int c=sn.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else if(b>c)
		{
			System.out.println(b+" is graeter");
		
		}
		else{
			System.out.println(c+" is greater");
		}
	}

}
