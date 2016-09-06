package hunter;
import java.util.Scanner;
public class numberrev {
public static void main(String args[]){
	int b;
	Scanner sa=new Scanner(System.in);
	int a=sa.nextInt();
	while(a>0)
	{
	b=a%10;
	System.out.print(+b);
	a=a/10;
	}
}
}
