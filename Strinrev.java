package number;
import java.util.Scanner;

public class Strinrev {
public static void main(String args[]){
	String a,c="";
	Scanner sc=new Scanner(System.in);
	a=sc.nextLine();
	int b=a.length();
	for(int i=b-1;i>=0;i--)
		c=c+a.charAt(i);
	System.out.println("the reverse string is:"+c);
	  
}
}
