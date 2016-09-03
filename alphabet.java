package number;
import java.util.Scanner;
public class alphabet {
public static void main(String args[]){
	Scanner sr=new Scanner(System.in);
	char d=sr.next().charAt(0);
	if((d>'a')&&(d<'z'))
	{
		System.out.println("alphabets");
	
	}
	else
	{
		System.out.println("not alphabets");
	}
}
}
