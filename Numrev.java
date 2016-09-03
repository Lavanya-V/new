package number;
import java.util.Scanner;
public class Numrev{
public static void main(String args[]){
	int z;
	Scanner sa=new Scanner(System.in);
	int x=sa.nextInt();
	while(x!=0)
	{
		z=x%10;
		System.out.print(+z);
		x=x/10;
	}
}
}
