package number;
import java.util.Scanner;
public class natural {
	public static void main(String args[]){
		int sum=0;
		Scanner ss=new Scanner(System.in);
		int z=ss.nextInt();
		for(int i=1;i<=z;i++)
		{
			sum=sum+i;
		}
			System.out.println("the sum of the number is"+sum);
		}
	}

