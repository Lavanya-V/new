package number;
import java.util.Scanner;
public class Armstrong {
	public static void main(String args[]){
		int b=0,a,c;
		Scanner ss=new  Scanner(System.in);
		int n=ss.nextInt();
		c=n;
		while(n!=0)
		{
			a=n%10;
			b+=a*a*a;
			n=n/10;
		}
			if(b==c)
			{
				System.out.println("its is armstrong number");
			}
				else
			{
	            System.out.println("it is not armstrong nuumber");
			}
	
	}

}
